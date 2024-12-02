package exercise4;

import java.time.LocalDate;

abstract public class Account {
    private static int nextAccountNumber = 1; 
    private String accountNumber;            
    private String accountName;             
    private String phone;                    
    private String email;                    
    private double balance;                  
    private LocalDate createdDate;           
    private boolean isActive;                

    public Account(String accountName, String phone, String email, double balance) {
        this.accountNumber = String.format("%06d", nextAccountNumber++);
        this.accountName = accountName;
        this.phone = phone;
        this.email = email;
        this.balance = balance;
        this.createdDate = LocalDate.now();
        this.isActive = true;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    // nạp tiền 
    public void deposit(double amount) {
        balance += amount;
    }

    // rút tiền 
    public void withdraw(double amount) {
        balance -= amount;
    }

    // cộng với tiền lãi 
    public void addInterest(double rate) {
        balance += balance * rate / 100;
    }

    public abstract void displayInfo();
}
