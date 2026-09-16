package in.coderarmy;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class OrderService {
    PaymentService paymentService;

    public OrderService(@Lazy PaymentService paymentService){

        //here @Lazy solves circular dependency
        this.paymentService=paymentService;
        System.out.println("OrderService created");
    }

    public void placeOrder(){

        paymentService.pay();
        System.out.println("order placed....!");
    }
}
