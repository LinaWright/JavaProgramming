package homework_practices.amazonAccount;

public class UseAmazon {
    public static void main(String[] args) {
        AmazonAccount account = new AmazonAccount("James", "jamesbound@gmail.com", true);

        account.setUserName("lina");
        account.setEmail("lina@gmail.com");
        account.setHasPrime(false);

        System.out.println(account);

        System.out.println(account.getEmail());
    }

}
