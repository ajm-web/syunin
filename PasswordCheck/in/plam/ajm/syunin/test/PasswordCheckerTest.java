package in.plam.ajm.syunin.test;

import in.plam.ajm.syunin.PasswordChecker;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mpon on 2014/03/29.
 */
public class PasswordCheckerTest {
    
    @Test
    public void testLength() throws Exception {
        PasswordChecker pc = new PasswordChecker();
        assertEquals(pc.check("A1213pokl"),false);
    }
    
    @Test
    public void testLengthOK() throws Exception {
        PasswordChecker pc = new PasswordChecker();
        assertEquals(pc.check("bAse730onE"),true);
    }
    
    @Test
    public void testNotDigitUpper() throws Exception {
        PasswordChecker pc = new PasswordChecker();
        assertEquals(pc.check("asasasasasasasaas"),false);
    }
    
    @Test
    public void testNotDigit() throws Exception {
        PasswordChecker pc = new PasswordChecker();
        assertEquals(pc.check("QWERTYqwerty"),false);
    }
    
    @Test
    public void testNotLetter() throws Exception {
        PasswordChecker pc = new PasswordChecker();
        assertEquals(pc.check("123456123456"),false);
    }
    
    @Test
    public void testNotLetterOK() throws Exception {
        PasswordChecker pc = new PasswordChecker();
        assertEquals(pc.check("QwErTy911poqqqq"),true);
    }
}
