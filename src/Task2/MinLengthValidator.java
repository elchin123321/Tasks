package Task2;


public class MinLengthValidator extends PasswordValidator {
    private final int minLength;

    public MinLengthValidator(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean validate(String password) throws Exception {

        if(password.length()>=minLength){
            return true;
        }
        throw new Exception("Password is too short");
    }
}
