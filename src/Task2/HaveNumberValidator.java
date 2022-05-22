package Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HaveNumberValidator extends PasswordValidator{
    @Override
    public boolean validate(String password) throws Exception {
        Pattern pattern = Pattern.compile(".*\\d.*");

        Matcher matcher = pattern.matcher(password);
        if(matcher.find()){
            return true;
        }
        throw new Exception("Password does not contain at least one number");
    }
}
