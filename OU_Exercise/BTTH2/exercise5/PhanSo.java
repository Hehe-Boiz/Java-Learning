package exercise5;

public class PhanSo {
    private int tuSo;
    private int mauSo;
    private static int count = 0;

    public PhanSo(){
        this.tuSo =0;
        this.mauSo = 1;
        count ++;
    }

    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        reduceFraction();
        count++;
    }

    public static int findGreatestCommonDivisor(int mauSo, int tuSo){
        // int n = Math.min(mauSo, tuSo);
        // for(int i = n - 1; i>=1; i++){
        //     if(mauSo % i == 0 && tuSo % i == 0){
        //         return i;
        //     }
        // }
        // return 1;

        int a = mauSo;
        int b = tuSo;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void reduceFraction(){
        int gcd = findGreatestCommonDivisor(this.mauSo, this.tuSo);
        this.tuSo /= gcd;
        this.mauSo /= gcd;

        if(mauSo < 0){
            this.tuSo = -this.tuSo;
            this.mauSo = -this.mauSo;
        }
    }

    public PhanSo add(PhanSo other){
        int newNum = this.tuSo * other.mauSo + other.tuSo*this.mauSo;
        int newDeno = this.mauSo * other.mauSo;
        PhanSo newPhanSo = new PhanSo(newNum, newDeno);
        newPhanSo.reduceFraction();
        return newPhanSo;
    }

    public PhanSo sub(PhanSo otherFraction){
        int newNum = this.tuSo*otherFraction.mauSo - otherFraction.tuSo*this.mauSo;
        int newDeno =  this.mauSo*otherFraction.mauSo;
        PhanSo newPhanSo = new PhanSo(newNum, newDeno);
        newPhanSo.reduceFraction();
        return newPhanSo;
    }

    public PhanSo mul(PhanSo otherFraction){
        int newNum = this.tuSo*otherFraction.tuSo;
        int newDeno = this.mauSo*otherFraction.mauSo;
        PhanSo newPhanSo = new PhanSo(newNum, newDeno);
        newPhanSo.reduceFraction();
        return newPhanSo;
    }

    public PhanSo div(PhanSo otherFraction){
        int newNum = this.tuSo*otherFraction.mauSo;
        int newDeno = this.mauSo*otherFraction.tuSo;
        PhanSo newPhanSo = new PhanSo(newNum, newDeno);
        newPhanSo.reduceFraction();
        return newPhanSo;
    }

    public int comparePhanSo(PhanSo other){
        int thisValue = this.tuSo * other.mauSo;
        int otherValue = other.tuSo * this.mauSo;
        return Integer.compare(thisValue, otherValue);
    }

    @Override
    public String toString() {
        return tuSo + " / " + mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public static int getCount() {
        return count;
    }

    public void display() {
        System.out.println(this.toString());
    }
    
}
