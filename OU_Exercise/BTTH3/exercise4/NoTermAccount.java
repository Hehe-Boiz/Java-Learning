package exercise4;

public class NoTermAccount extends Account{
    public NoTermAccount(String accountName, String phone, String email, double balance) {
        super(accountName, phone, email, balance);
    }

    @Override
    public void displayInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Account Type: No Term Account");
    }
}
