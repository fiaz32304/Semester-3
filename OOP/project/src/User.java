public abstract class User {

    private int userID;
    private String name;
    private String email;
    private String password;

    public User(int userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getUserID() { return userID; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public abstract void displayRole();

    public void receiveNotification(String msg) {
        System.out.println(name + " received: " + msg);
    }
}
