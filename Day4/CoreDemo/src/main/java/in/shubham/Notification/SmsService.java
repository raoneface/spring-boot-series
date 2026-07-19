package in.shubham.Notification;

public class SmsService implements  NotificationService{
    @Override
    public void notification(){
        System.out.println("This is sms notification service");
    }
}
