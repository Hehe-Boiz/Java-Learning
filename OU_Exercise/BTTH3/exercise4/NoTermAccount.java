package exercise4;

public class NoTermAccount extends Account{
    public NoTermAccount(String accountName, String phone, String email, double balance) {
        super(accountName, phone, email, balance);
    }
    
    @Override
    public boolean isMaturityDate(){
        return true;
    }

    @Override
    public double caculatorInterest(){
        return (this.getBalance()*0.1)/12;
    }
}        