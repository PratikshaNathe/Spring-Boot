package in.coderarmy;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    OrderService orderService;

    public PaymentService(OrderService orderService){
        this.orderService=orderService;
    }

    public void pay(){
        System.out.println("payment successful");
    }
}
