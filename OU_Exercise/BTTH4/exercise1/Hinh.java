package exercise1;

import java.util.Objects;

public abstract class Hinh {
    protected String name;

    public Hinh(String name) {
        this.name = name;
    }

    public abstract double tinhDienTich();

    public abstract double tinhChuVi();

    @Override
    public String toString() {
        return "Hinh" + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Hinh h = (Hinh) obj;
        return this.name.equals(h.name);
    }
}
