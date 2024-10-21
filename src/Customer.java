import java.time.LocalDate;

public class Customer {
    String name;
    String personalNumber;
    LocalDate lastPaymentDate;

    public Customer(String name, String personalNumber, LocalDate lastPaymentDate) {
        this.name = name;
        this.personalNumber = personalNumber;
        this.lastPaymentDate = lastPaymentDate;
    }

    public boolean isCurrentMember() {
        return lastPaymentDate.isAfter(LocalDate.now().minusYears(1));
    }
}
