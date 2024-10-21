import org.junit.Test;

import java.io.IOException;
import static org.junit.Assert.*;

 public class MemberlistTest {

     @Test
     public void MemberlistTest() throws IOException {
         MembershipStatus system = new MembershipStatus();

         system.loadCustomers("memberlisttest.txt");

         Customer customer = system.findCustomer("7502031234");

         assertNotNull(customer);

         assertEquals("Anna Andersson", customer.name);
     }
 }