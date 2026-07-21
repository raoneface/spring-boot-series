package in.strikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private PaymentService paymentService;

//    @Autowired
//    OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
//
    public void orderPlaced() {
        paymentService.pay();
        System.out.println("Order Placed");
    }

    public void getOrderDetails(){
        System.out.println("Order details");
    }
}
