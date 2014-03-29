package in.plam.ajm.syunin;

/**
 * Created by mpon on 2014/03/29.
 */
public class PasswordChecker {

    public PasswordChecker() {}

    public Boolean check(String password) {
        if (password.length() < 10) return false;

        String regex1 = "[0-9]+";
        String regex2 = "[a-z]+";
        String regex3 = "[A-Z]+";

        return password.matches(regex1) & password.matches(regex2) & password.matches(regex3);

    }
}
