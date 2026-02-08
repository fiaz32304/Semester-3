import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            boolean exitApplication = false;
            while (!exitApplication) {
                System.out.println("====== LEARNING MANAGEMENT SYSTEM LOGIN ======");
                System.out.println("Select Role:");
                System.out.println("1. Admin");
                System.out.println("2. Teacher");
                System.out.println("3. Student");
                System.out.println("4. Exit Application");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); // buffer clear

                User user = null;

                // 🔹 ROLE BASED LOGIN
                switch (choice) {
                    case 1:
                        // Admin login with fixed credentials
                        System.out.print("Enter Admin ID: ");
                        int adminId = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Enter Admin Name: ");
                        String adminName = sc.nextLine();
                        
                        // Fixed admin credentials
                        if (adminId == 1 && adminName.equals("admin")) {
                            user = new Admin(adminId, adminName, "admin@lms.com", "admin123");
                            System.out.println("Admin logged in successfully!");
                        } else {
                            System.out.println("Invalid Admin credentials!");
                            continue;
                        }
                        break;

                    case 2:
                        // Teacher login with user input
                        System.out.print("Enter Teacher ID: ");
                        int teacherId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Teacher Name: ");
                        String teacherName = sc.nextLine();

                        System.out.print("Enter Teacher Email: ");
                        String teacherEmail = sc.nextLine();

                        System.out.print("Enter Teacher Password: ");
                        String teacherPassword = sc.nextLine();
                        
                        user = new Teacher(teacherId, teacherName, teacherEmail, teacherPassword);
                        System.out.println("Teacher registered and logged in successfully!");
                        break;

                    case 3:
                        // Student login with user input
                        System.out.print("Enter Student ID: ");
                        int studentId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String studentName = sc.nextLine();

                        System.out.print("Enter Student Email: ");
                        String studentEmail = sc.nextLine();

                        System.out.print("Enter Student Password: ");
                        String studentPassword = sc.nextLine();
                        
                        user = new Student(studentId, studentName, studentEmail, studentPassword);
                        System.out.println("Student registered and logged in successfully!");
                        break;
                        
                    case 4:
                        System.out.println("Exiting application...");
                        exitApplication = true;
                        continue;

                    default:
                        System.out.println("Invalid Role Selection!");
                        continue;
                }

                // 🔹 POLYMORPHISM
                user.displayRole();

                // 🔹 CONTINUOUS DASHBOARD LOOP
                boolean logout = false;
                while (!logout) {
                    try {
                        if (user instanceof Admin) {
                            logout = handleAdminFunctionality((Admin) user, sc);
                        } else if (user instanceof Teacher) {
                            logout = handleTeacherFunctionality((Teacher) user, sc);
                        } else if (user instanceof Student) {
                            logout = handleStudentFunctionality((Student) user, sc);
                        }
                    } catch (Exception e) {
                        System.out.println("An error occurred in dashboard: " + e.getMessage());
                        System.out.println("Returning to dashboard...");
                    }
                }
            }

            System.out.println("\n====== LMS APPLICATION CLOSED ======");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
    
    // Handle Admin specific functionality - returns true if user wants to logout
    private static boolean handleAdminFunctionality(Admin admin, Scanner sc) {
        try {
            System.out.println("\n--- ADMIN DASHBOARD ---");
            System.out.println("1. Create Course");
            System.out.println("2. Assign Teacher to Course");
            System.out.println("3. Add Lesson to Course");
            System.out.println("4. Logout");
            System.out.println("5. Main Menu");
            System.out.print("Select option: ");
            
            int option = sc.nextInt();
            sc.nextLine();
            
            switch (option) {
                case 1:
                    System.out.print("Enter Course ID: ");
                    int courseId = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Enter Course Title: ");
                    String courseTitle = sc.nextLine();
                    
                    System.out.print("Enter Course Description: ");
                    String courseDesc = sc.nextLine();
                    
                    Course newCourse = admin.createCourse(courseId, courseTitle, courseDesc);
                    System.out.println("Course created successfully: " + newCourse.getTitle());
                    return false; // Continue dashboard
                    
                case 2:
                    // For demo purposes, creating sample objects
                    Course course = new Course(101, "Java Programming", "Learn Java");
                    Teacher teacher = new Teacher(101, "John Smith", "john@school.com", "pass123");
                    admin.assignTeacherToCourse(course, teacher);
                    return false; // Continue dashboard
                    
                case 3:
                    // For demo purposes, creating sample objects
                    Course course2 = new Course(102, "Data Structures", "Learn DS");
                    Lesson lesson = new Lesson(201, "Arrays", "Learn about arrays");
                    admin.addLessonToCourse(course2, lesson);
                    return false; // Continue dashboard
                    
                case 4:
                    System.out.println("Logging out...");
                    return true; // Logout
                    
                case 5:
                    System.out.println("Returning to main menu...");
                    return true; // Return to main menu
                    
                default:
                    System.out.println("Invalid option!");
                    return false; // Continue dashboard
            }
        } catch (Exception e) {
            System.out.println("Error in admin functionality: " + e.getMessage());
            return false; // Continue dashboard
        }
    }
    
    // Handle Teacher specific functionality - returns true if user wants to logout
    private static boolean handleTeacherFunctionality(Teacher teacher, Scanner sc) {
        try {
            System.out.println("\n--- TEACHER DASHBOARD ---");
            System.out.println("1. Create Assignment");
            System.out.println("2. Create Quiz");
            System.out.println("3. Enroll Student");
            System.out.println("4. Logout");
            System.out.println("5. Main Menu");
            System.out.print("Select option: ");
            
            int option = sc.nextInt();
            sc.nextLine();
            
            switch (option) {
                case 1:
                    System.out.print("Enter Assignment ID: ");
                    int assignId = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Enter Assignment Title: ");
                    String assignTitle = sc.nextLine();
                    
                    System.out.print("Enter Assignment Description: ");
                    String assignDesc = sc.nextLine();
                    
                    Assignment assignment = teacher.createAssignment(assignId, assignTitle, assignDesc);
                    System.out.println("Assignment created successfully: " + assignment.getAssignmentID());
                    return false; // Continue dashboard
                    
                case 2:
                    System.out.print("Enter Quiz ID: ");
                    int quizId = sc.nextInt();
                    
                    System.out.print("Enter Quiz Marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine(); // buffer clear
                    
                    Quiz quiz = teacher.createQuiz(quizId, marks);
                    System.out.println("Quiz created successfully: " + quiz.getQuizID());
                    return false; // Continue dashboard
                    
                case 3:
                    // For demo purposes, creating sample objects
                    Student student = new Student(201, "Alice Johnson", "alice@student.com", "student123");
                    Course course = new Course(101, "Mathematics", "Basic Math");
                    teacher.enrollStudent(student, course);
                    return false; // Continue dashboard
                    
                case 4:
                    System.out.println("Logging out...");
                    return true; // Logout
                    
                case 5:
                    System.out.println("Returning to main menu...");
                    return true; // Return to main menu
                    
                default:
                    System.out.println("Invalid option!");
                    return false; // Continue dashboard
            }
        } catch (Exception e) {
            System.out.println("Error in teacher functionality: " + e.getMessage());
            return false; // Continue dashboard
        }
    }
    
    // Handle Student specific functionality - returns true if user wants to logout
    private static boolean handleStudentFunctionality(Student student, Scanner sc) {
        try {
            System.out.println("\n--- STUDENT DASHBOARD ---");
            System.out.println("1. View Available Courses");
            System.out.println("2. Enroll in Course");
            System.out.println("3. Submit Assignment");
            System.out.println("4. Take Quiz");
            System.out.println("5. View Marks");
            System.out.println("6. Logout");
            System.out.println("7. Main Menu");
            System.out.print("Select option: ");
            
            int option = sc.nextInt();
            sc.nextLine();
            
            switch (option) {
                case 1:
                    student.viewAvailableCourses();
                    return false; // Continue dashboard
                    
                case 2:
                    student.viewAvailableCourses();
                    if (Course.getCourseCount() > 0) {
                        System.out.print("Enter course number to enroll (1-" + Course.getCourseCount() + "): ");
                        int courseIndex = sc.nextInt();
                        sc.nextLine();
                        student.enrollInAvailableCourse(courseIndex);
                    }
                    return false; // Continue dashboard
                    
                case 3:
                    // For demo purposes, creating sample objects
                    Assignment assignment = new Assignment(301, "Homework 1", "Solve problems");
                    student.submitAssignment(assignment, "This is my solution");
                    return false; // Continue dashboard
                    
                case 4:
                    // For demo purposes, creating sample objects
                    Quiz quiz = new Quiz(401, 10);
                    student.takeQuiz(quiz);
                    return false; // Continue dashboard
                    
                case 5:
                    student.viewMyMarks();
                    return false; // Continue dashboard
                    
                case 6:
                    System.out.println("Logging out...");
                    return true; // Logout
                    
                case 7:
                    System.out.println("Returning to main menu...");
                    return true; // Return to main menu
                    
                default:
                    System.out.println("Invalid option!");
                    return false; // Continue dashboard
            }
        } catch (Exception e) {
            System.out.println("Error in student functionality: " + e.getMessage());
            return false; // Continue dashboard
        }
    }
}