

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(){
        numerator = 0;
        denominator = 0;
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction otherFraction){
        this.numerator = otherFraction.numerator;
        this.denominator = otherFraction.denominator;
    }

    public Fraction add(Fraction otheFraction){
        int newNum = this.numerator * otheFraction.denominator + otheFraction.numerator*this.denominator;
        int newDeno = this.denominator * otheFraction.denominator;
        return new Fraction(newNum, newDeno);
    }

    public Fraction sub(Fraction otherFraction){
        int newNum = this.numerator*otherFraction.denominator - otherFraction.numerator*this.denominator;
        int newDeno =  this.denominator*otherFraction.denominator;
        return new Fraction(newNum, newDeno);
    }

    public Fraction mul(Fraction otherFraction){
        int newNum = this.numerator*otherFraction.numerator;
        int newDeno = this.denominator*otherFraction.denominator;
        return new Fraction(newNum, newDeno);
    }

    public Fraction div(Fraction otherFraction){
        int newNum = this.numerator*otherFraction.denominator;
        int newDeno = this.denominator*otherFraction.numerator;
        return new Fraction(newNum, newDeno);
    }

    public void reducer(){
        int  min = (numerator < denominator)? numerator : denominator;
        for(int i = min; i > 0; i--){
            if(numerator%i == 0 && denominator%i == 0){
                numerator /= i;
                denominator /= i;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Numerator: " + numerator +" Denominator: " + denominator;
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1,2);
        Fraction fraction2 = new Fraction(2,4);

        
        System.out.println("Fraction 1: "+fraction1.toString());
        Fraction fraction3 = fraction1.add(fraction2);
        System.out.println("Fraction 3 = Fraction1  + Fraction2: "+fraction3.toString());
        fraction3.reducer();
        System.out.println("Reduce Fraction 3 = "+fraction3.toString());
    }

}
