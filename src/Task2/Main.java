package Task2;

public class Main {
    public static void main(String[] args) {
        String password = "asdssdasd1a";
        ValidatorChain chain1 = new ValidatorChain(new EmptyValidator());
        ValidatorChain chain2 = new ValidatorChain(new MinLengthValidator(8));
        ValidatorChain chain3 = new ValidatorChain(new HaveNumberValidator());
        chain1.setNextValidatorChain(chain2);
        chain2.setNextValidatorChain(chain3);
        try {
            chain1.validate(password);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
