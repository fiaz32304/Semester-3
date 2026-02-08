public class Notification {

    private int notificationId;
    private String message;
    private User user;
    private String date;

    public Notification(String msg, User u) {
        this.message = msg;
        this.user = u;
    }

    // Added constructor with four parameters
    public Notification(int id, String msg, User u, String date) {
        this.notificationId = id;
        this.message = msg;
        this.user = u;
        this.date = date;
    }

    public void send() {
        user.receiveNotification(message);
    }
}