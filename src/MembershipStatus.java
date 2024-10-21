import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MembershipStatus {
    List<Customer> customers = new ArrayList<>();

    public void loadCustomers(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] customerData = line.split(", ");
            String personalNumber = customerData[0];
            String name = customerData[1];
            LocalDate paymentDate = LocalDate.parse(reader.readLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            customers.add(new Customer(name, personalNumber, paymentDate));
        }
        reader.close();
    }

    public Customer findCustomer(String search) {
        for (Customer customer : customers) {
            if (customer.personalNumber.equals(search) || customer.name.equalsIgnoreCase(search)) {
                return customer;
            }
        }
        return null;
    }

    public String checkMembershipStatus(String search) {
        Customer customer = findCustomer(search);
        if (customer != null) {
            if (customer.isCurrentMember()) {
                return "Nuvarande medlem";
            } else {
                return "Före detta medlem";
            }
        } else {
            return "Ej medlem";
        }
    }
}
