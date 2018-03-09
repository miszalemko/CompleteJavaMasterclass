import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        VipCustomer firstCustomer = new VipCustomer();
        VipCustomer secondCustomer = new VipCustomer("Jack",new BigDecimal(1500));
        VipCustomer thirdCustomer = new VipCustomer("Nona",new BigDecimal(1200),"nona@gmail.com");

        System.out.println(firstCustomer);
        System.out.println(secondCustomer);
        System.out.println(thirdCustomer);
    }
}
