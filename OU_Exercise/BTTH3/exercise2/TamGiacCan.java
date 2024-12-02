package exercise2;

public class TamGiacCan extends TamGiac{
    public TamGiacCan(double ab, double c) {
        super(ab, ab, c);
        if (!isIsoscelesTriangle(ab, ab, c)) {
            throw new IllegalArgumentException("Các cạnh không thỏa mãn điều kiện để tạo thành tam giác cân");
        }
    }

    private boolean isIsoscelesTriangle(double a, double b, double c) {
        return (a == b || a == c || b == c);
    }

    @Override
    public String toString() {
        return String.format("Tam giác cân với các cạnh: a=%.2f, b=%.2f, c=%.2f, Chu vi=%.2f, Diện tích=%.2f",
                             getA(), getB(), getC(), tinhChuVi(), tinhDienTich());
    }
}
