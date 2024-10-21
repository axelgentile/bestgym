import java.io.IOException;
import java.util.Scanner;

public class BestGymMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MembershipStatus gymSystem = new MembershipStatus();
        PersonalTrainerLog trainerLogger = new PersonalTrainerLog();

        try {
            gymSystem.loadCustomers("memberlist.txt");
        } catch (IOException e) {
            System.out.println("Kunde inte ladda kunddata.");
            return;
        }

        System.out.print("Ange kundens personnummer eller namn: ");
        String search = scanner.nextLine();

        String status = gymSystem.checkMembershipStatus(search);
        System.out.println(status);

        if (status.equals("Nuvarande medlem")) {
            Customer customer = gymSystem.findCustomer(search);
            try {
                trainerLogger.logTraining(customer, "traininglog.txt");
                System.out.println("Kundens träning har loggats.");
            } catch (IOException e) {
                System.out.println("Kunde inte logga träning.");
            }
        }
    }
}
