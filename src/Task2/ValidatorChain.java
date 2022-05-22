package Task2;

public class ValidatorChain implements PasswordHandler{
    private final PasswordValidator passwordValidator;
    private ValidatorChain nextValidatorChain;

    public ValidatorChain(PasswordValidator passwordValidator) {
        this.passwordValidator = passwordValidator;
    }


    @Override
    public boolean validate(String password) throws Exception {
        if(passwordValidator.validate(password) && nextValidatorChain!=null)
            nextValidatorChain.validate(password);

        return true;
    }

    public void setNextValidatorChain(ValidatorChain validatorChain){
        this.nextValidatorChain = validatorChain;
    }
}
