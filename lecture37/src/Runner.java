import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(new BigDecimal(1000));
        System.out.println(account.deposit(new BigDecimal(10.55)));
        System.out.println(account.withdraw(new BigDecimal(10.56)));
    }
}
