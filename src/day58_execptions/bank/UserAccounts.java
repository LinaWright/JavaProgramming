package day58_execptions.bank;

public class UserAccounts {
    public static void main(String[] args) {
        Bank accountOne = new Bank();
        accountOne.balance = 1000;
        accountOne.withDraw(500);
        System.out.println(accountOne.balance);

        //accountOne.withDraw(2000);

        //valid login
        try {
            accountOne.login("jamesbond" , "007");
        } catch (InvalidCredentialsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        //invalid username
        try {
            accountOne.login("james" , "007");
        } catch (InvalidCredentialsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        //invalid password
        try {
            accountOne.login("jamesbond" , "008000");
        } catch (InvalidCredentialsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
