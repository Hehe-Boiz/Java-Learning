package exercise4;

import java.time.LocalDate;

public enum KyHan {
    MOT_TUAN(1, 0.5){
        @Override
        public LocalDate caculatorTime(LocalDate start) {
            return start.plusWeeks(this.time);
        }

        @Override
        public double caculatorInterest(double balance){
            return (balance * this.interest)/12*4;
        }
    },    

    MOT_THANG(1, 4.5) {
        @Override
        public LocalDate caculatorTime(LocalDate start) {
            return start.plusMonths(this.time);
        }

        @Override
        public double caculatorInterest(double balance){
            return (balance * this.interest)/12;
        }
    }, 

    MOT_NAM(1, 6.8){
        @Override
        public LocalDate caculatorTime(LocalDate start) {
            return start.plusYears(this.time);
        }

        @Override
        public double caculatorInterest(double balance){
            return (balance * this.interest);
        }
    };
    protected int time;
    protected double interest;

    private KyHan(int time, double interest){
        this.time = time;
        this.interest = interest;
    }

    public abstract LocalDate caculatorTime(LocalDate start);
    public abstract double caculatorInterest(double balance);
}
