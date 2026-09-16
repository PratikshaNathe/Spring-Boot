package in.coderarmy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    @Autowired
    OrderService orderService;

//    public PaymentService(OrderService orderService){
//        this.orderService = orderService;
//    }

    public void pay(){
        System.out.println("payment successful");
        //orderService.orderDetails();

    }
}
