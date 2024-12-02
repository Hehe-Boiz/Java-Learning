package exercise2;

public class TamGiacDeu extends TamGiacCan{
    public TamGiacDeu(double abc) {
        super(abc, abc);
        if (!isEquilateralTriangle(abc, abc, abc)) {
            throw new IllegalArgumentException("Các cạnh không thỏa mãn điều kiện để tạo thành tam giác đều");
        }
    }

    private boolean isEquilateralTriangle(double a, double b, double c) {
        return (a == b && b == c);
    }

    @Override
    public String toString() {
        return String.format("Tam giác đều với các cạnh: a=%.2f, b=%.2f, c=%.2f, Chu vi=%.2f, Diện tích=%.2f",
                             getA(), getB(), getC(), tinhChuVi(), tinhDienTich());
    }
}
