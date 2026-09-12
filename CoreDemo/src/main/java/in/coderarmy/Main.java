package in.coderarmy;

import in.coderarmy.notification.NotificationService;
import in.coderarmy.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        NotificationService notification =new SmsService();
        OrderService order =new OrderService(notification);
        order.placeOrder();

    }
}
