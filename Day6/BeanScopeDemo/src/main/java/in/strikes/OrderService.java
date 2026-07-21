package in.strikes;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public OrderService(){
        System.out.println("Order service object");
    }

    public void orderPlace(){
        System.out.println("Order Placed");
    }
}
