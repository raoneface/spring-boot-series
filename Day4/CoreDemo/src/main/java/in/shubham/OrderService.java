package in.shubham;
import in.shubham.Notification.NotificationService;
public class OrderService {


    private final NotificationService service;


    public OrderService(NotificationService service){
        this.service = service;
    }

    public void placeOrder(){
        service.notification();
        System.out.println("Order Service");
    }
}
