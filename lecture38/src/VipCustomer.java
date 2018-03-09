import java.math.BigDecimal;

public class VipCustomer {
    private String name;
    private BigDecimal creditLimit;
    private String emailAdress;

    public VipCustomer() {
        this("Peter",new BigDecimal(2000),"peter@gmail.com");
    }

    public VipCustomer(String name, BigDecimal creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = "jack@gmail.com";
    }

    public VipCustomer(String name, BigDecimal creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }
}
