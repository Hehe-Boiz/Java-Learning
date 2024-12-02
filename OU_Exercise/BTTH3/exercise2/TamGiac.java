package exercise2;

public class TamGiac {
    private double a;
    private double b;
    private double c;

    public TamGiac(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("Các cạnh không thỏa mãn điều kiện để tạo thành tam giác");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return (a > 0 && b > 0 && c > 0) &&
               (a + b > c) &&
               (a + c > b) &&
               (b + c > a);
    }

    public double tinhChuVi() {
        return a + b + c;
    }

    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
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
    public String toString() {
        return String.format("Tam giác với các cạnh: a=%.2f, b=%.2f, c=%.2f, Chu vi=%.2f, Diện tích=%.2f",
                             a, b, c, tinhChuVi(), tinhDienTich());
    }
}
