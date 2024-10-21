import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CurrentMemberTest {

    @Test
    public void testCurrentMember() throws IOException {
        MembershipStatus system = new MembershipStatus();

        system.loadCustomers("memberlisttest.txt");

        String status = system.checkMembershipStatus("0209029099");

        assertEquals("Nuvarande medlem", status);
    }
}
