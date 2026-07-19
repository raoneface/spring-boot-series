package in.coderarmy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final PaymentService service;
    @Autowired
    OrderService(PaymentService service){
        this.service=service;
    }
    public void orderService(){
        service.pay();
        System.out.println("Order service executed");
    }
}
