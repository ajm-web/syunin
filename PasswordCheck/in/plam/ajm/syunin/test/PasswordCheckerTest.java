package in.plam.ajm.syunin.test;

import in.plam.ajm.syunin.PasswordChecker;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mpon on 2014/03/29.
 */
public class PasswordCheckerTest {
    @Test
    public void testCheck() throws Exception {
        PasswordChecker pc = new PasswordChecker();
        assertEquals(pc.check(""),true);
    }
}
