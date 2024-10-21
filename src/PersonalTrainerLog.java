import java.io.*;
import java.time.LocalDate;

public class PersonalTrainerLog {

    public void logTraining(Customer customer, String filePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
        String log = customer.personalNumber + ", " + customer.name + ", " + LocalDate.now();

        writer.write(log);
        writer.newLine();
        writer.close();
    }
}
