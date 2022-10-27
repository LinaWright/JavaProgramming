package day58_execptions.bank;

public class Bank {
    double balance;
    public void withDraw(double amountToTakeOut){
        if(amountToTakeOut>balance){
//            NotEnoughMoneyException e = new NotEnoughMoneyException();
//            throw e;
            throw new NotEnoughMoneyException("Balance only has "  + balance);
        }

        balance -=amountToTakeOut;
    }

    //in this method we created checked exceptions, so they myst be handled, but we created the class, so we don't have to handle it. We use throws to allow the program to compile so the user of the class handles the exceptions
    public void login(String username, String password) throws InvalidCredentialsException {
        if(!username.equals("jamesbond")){
            throw new InvalidCredentialsException("Invalid user name");
        }
        if(!password.equals("007")){
            throw new InvalidCredentialsException("Invalid password");
        }

        System.out.println("LOGIN");
    }
}
