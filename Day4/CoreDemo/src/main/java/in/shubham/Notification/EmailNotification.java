package in.shubham.Notification;

public class EmailNotification implements NotificationService{
    @Override
    public void notification(){
        System.out.println("This is Email Notification service");
    }
}
