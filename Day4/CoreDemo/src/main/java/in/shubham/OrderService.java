package in.shubham;
import in.shubham.Notification.NotificationService;
public class OrderService {


    NotificationService service;


    public OrderService(NotificationService service){
        this.service = service;
    }
    public OrderService(){

    }

    public void placeOrder(){
        service.notification();
        System.out.println("Order Service");
    }
    public void setnotificatiopn(NotificationService service){
        this.service = service;
    }
}
