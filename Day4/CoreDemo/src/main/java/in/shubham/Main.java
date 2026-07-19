package in.shubham;
import in.shubham.Notification.EmailNotification;
import in.shubham.Notification.NotificationService;
public class Main {
    public static void main(String[] args) {
        NotificationService service = new EmailNotification();
        OrderService order = new OrderService(service);
        order.placeOrder();
    }
}