import java.math.BigDecimal;
import java.math.RoundingMode;


public class Account {
    private long number;
    private BigDecimal balance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    public String deposit(BigDecimal depositValue) {
        this.balance = this.balance.add(depositValue);
        return "You deposited " + depositValue.setScale(2, RoundingMode.DOWN) +
                " and your balance now is: " + this.balance.setScale(2, RoundingMode.DOWN);
    }
    public String withdraw(BigDecimal withdrawValue) {
        if (withdrawValue.compareTo(this.balance) == -1 || withdrawValue.compareTo(this.balance) == 0) {
            this.balance = this.balance.subtract(withdrawValue);
            return "You withdrawed " + withdrawValue.setScale(2, RoundingMode.DOWN) +
                    " and your balance now is " + this.balance.setScale(2, RoundingMode.DOWN);
        }else {
            return "Insufficient funds in the account. Your balance is " + this.balance.setScale(2, RoundingMode.DOWN);
        }
    }

    public long getNumber() {
        return this.number;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
