package in.coderarmy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    PaymentService paymentService;

//    public OrderService(PaymentService paymentService){
//        this.paymentService=paymentService;
//    }

    public void order(){

        paymentService.pay();
        System.out.println("order placed....!");
        orderDetails();
    }

    public void orderDetails(){
        System.out.println("order details");
    }
}
