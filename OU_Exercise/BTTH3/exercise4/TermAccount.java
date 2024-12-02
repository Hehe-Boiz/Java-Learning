package exercise4;

import java.time.LocalDate;

enum KyHan {
    MOT_TUAN, MOT_THANG, MOT_NAM
}

public class TermAccount extends Account {
    private KyHan term;
    private LocalDate maturityDate;

    public TermAccount(String accountName, String phone, String email, double balance, KyHan term) {
        super(accountName, phone, email, balance);
        this.term = term;
        this.maturityDate = calculateMaturityDate(term);
    }

    // tính toán thời gian hết hạn
    private LocalDate calculateMaturityDate(KyHan term) {
        switch (term) {
            case MOT_TUAN:
                return LocalDate.now().plusWeeks(1);
            case MOT_THANG:
                return LocalDate.now().plusMonths(1);
            case MOT_NAM:
                return LocalDate.now().plusYears(1);
            default:
                throw new IllegalArgumentException("Invalid term");
        }
    }

    // đạt đến kỳ hạn chưa
    public boolean isMaturityDate() {
        return LocalDate.now().isEqual(maturityDate);
    }

    public void updateMaturityDate(KyHan newTerm) {
        if (newTerm != null) {
            this.term = newTerm; 
        }
        this.maturityDate = calculateMaturityDate(this.term); 
        System.out.println("Maturity date updated to: " + maturityDate);
    }

    public KyHan getTerm() {
        return term;
    }

    @Override
    public void displayInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Account Type: Term Account");
        System.out.println("Term: " + term);
        System.out.println("Maturity Date: " + maturityDate);
    }
}
