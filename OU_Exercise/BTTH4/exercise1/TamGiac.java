package exercise1;

class TamGiac extends Hinh {
    private double a, b, c;

    public TamGiac(double a, double b, double c, String name) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double tinhChuVi() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return String.format("%s - Chiều dài 1: %.1f - Chiều dài 2: %.1f - Chiều dài 3: %.1f", super.toString(), this.a,
                this.b, this.c);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(c);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TamGiac) {
            TamGiac h = (TamGiac) obj;

            return super.equals(obj) && Double.compare(this.a, h.a) == 0 && Double.compare(this.b, h.b) == 0
                    && Double.compare(this.c, h.c) == 0;
        }
        return false;
    }

}