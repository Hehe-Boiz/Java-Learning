package exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class QLHinh {
    private static List<Hinh> list = new ArrayList<>();

    public void addHinh(Hinh ...a){
        list.addAll(Arrays.asList(a));
    }

    public boolean deleteHinh(String name){
        return list.removeIf(h -> h.getName().equalsIgnoreCase(name));
    }

    public void display(){
        list.forEach(h -> System.out.println(h));
    }

    public List<Hinh> timKiem(String tenLop) throws ClassNotFoundException{
        @SuppressWarnings("rawtypes")
        Class c = Class.forName(tenLop);

        // return list.stream().filter(h -> c.isInstance(h)).collect(Collectors.toList()); 
        return list.stream()
               .filter(h -> c.equals(h.getClass()))  // Chỉ kiểm tra lớp chính, không bao gồm lớp con
               .collect(Collectors.toList());
    }

    public void sortGiam(){
        // list.sort((h1, h2) -> Double.compare(h1.tinhDienTich(), h2.tinhDienTich()));
        list.sort(Comparator.comparing(Hinh::tinhDienTich).reversed());
    }

    public void sortName(){
        list.sort(Comparator.comparing(Hinh::getName).thenComparing(Hinh::tinhDienTich).reversed());
    }

    public double tinhTB(){
        return list.stream().flatMapToDouble(h -> DoubleStream.of(h.tinhDienTich())).average().getAsDouble();
    }

    public int timHinh(Hinh h){
        return list.indexOf(h);
    }
}
