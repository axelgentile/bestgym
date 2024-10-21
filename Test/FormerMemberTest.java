import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FormerMemberTest {

    @Test
    public void FormerMemberTest() throws IOException {
        MembershipStatus system = new MembershipStatus();

        system.loadCustomers("memberlisttest.txt");

        String status = system.checkMembershipStatus("8505132345");

        assertEquals("Före detta medlem", status);
    }
}

