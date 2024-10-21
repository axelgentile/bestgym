import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class NonMemberTest {

    @Test
    public void NonMemberTest() throws IOException {
        MembershipStatus system = new MembershipStatus();

        system.loadCustomers("memberlisttest.txt");

        String status = system.checkMembershipStatus("0000000000");

        assertEquals("Ej medlem", status);
    }
}
