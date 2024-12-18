package exercise4;

import java.time.LocalDate;

public class TermAccount extends Account {
    private KyHan term;
    private LocalDate maturityDate;

    public TermAccount(String accountName, String phone, String email, double balance, KyHan term) {
        super(accountName, phone, email, balance);
        this.term = term;
        this.maturityDate = term.caculatorTime(LocalDate.now());
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
        super.displayInfo();
        System.out.printf("Ky han: %s\nNgay dao han: %s\n",this.term, this.maturityDate.format(Config.FORMATTER));
    }

    @Override
    public boolean isMaturityDate(){
        return this.maturityDate.equals(LocalDate.now());
    }

    @Override
    public double caculatorInterest(){
        return this.term.caculatorInterest(getBalance());
    }
}
