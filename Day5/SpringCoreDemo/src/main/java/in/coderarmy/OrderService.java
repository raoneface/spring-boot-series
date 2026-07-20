package in.coderarmy;

import in.coderarmy.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private  Payment payService;

     //dependencies injection through constructor
        @Autowired
        OrderService(@Qualifier("ca") Payment payService){
            this.payService = payService;
        }

//    dependencies injection through setter
//    @Autowired
//    public void setPaymentService(PaymentService service){
//        this.service = service;
//    }

    public void orderService(){
        payService.pay();
        System.out.println("Order service executed");
    }
}
