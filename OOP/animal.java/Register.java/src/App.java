public class App {
    public static void main(String[] args) throws Exception {
        Employee emp=new Employee("John Doe","2023-10-01",50000);
        emp.register();

        Student stu=new Student("Jane Smith",20,3);
        stu.register();
    }
}
