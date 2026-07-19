package in.shubham;

import in.shubham.Notification.EmailNotification;
import in.shubham.Notification.NotificationService;

public class OrderService {
    NotificationService service = new EmailNotification();
    public void placeOrder(){
        service.notification();
        System.out.println("Order Service");
    }
}
