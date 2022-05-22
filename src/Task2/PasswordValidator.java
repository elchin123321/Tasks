package Task2;

public abstract class PasswordValidator implements PasswordHandler{

    @Override
    public boolean validate(String password) throws Exception {

        if(password.isEmpty()){
            throw new Exception("Password is empty");
        }
        return true;
    }
}
