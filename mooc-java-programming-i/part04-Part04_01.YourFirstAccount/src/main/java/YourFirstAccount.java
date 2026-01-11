public class YourFirstAccount {

    public static void main(String[] args) {
        Account jhonAccount = new Account("Jhon", 100);
        jhonAccount.deposit(20);
        System.out.println(jhonAccount);
    }
}
