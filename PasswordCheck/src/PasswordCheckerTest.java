import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
