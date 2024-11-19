package exercise6;

import exercise5.PhanSo;
import java.util.ArrayList;
import java.util.Collections;

public class DsPhanSo {
    private ArrayList<PhanSo> list;

    public DsPhanSo() {
        list = new ArrayList<>();
    }

    public void add(PhanSo ps){
        list.add(ps);
    }

    public void display(){
        for(PhanSo ps: list){
            System.out.println(ps.toString());
        }
    }

    public void removeElement(PhanSo ps){
        for(PhanSo PS : list){
            if(PS.comparePhanSo(ps) == 0){
                list.remove(ps);
                return;
            }
        }
        System.out.println("Khong tim thay");
    }

    public void removeElementOptimize(PhanSo ps){
        this.list.removeIf(q -> q.comparePhanSo(ps) == 0);
    }

    public void removeElement(int tuSo, int mauSo){
        for(PhanSo ps : list){
            if(ps.getTuSo() == tuSo && ps.getMauSo() == mauSo){
                list.remove(ps);
                return;
            }
        }
        System.out.println("Khong tim thay");
    }

    public PhanSo sumAllPhanSoOptimize(){
        return this.list.stream().reduce(new PhanSo(), (t,x) -> t.add(x));
    }

    public PhanSo sumAllPhanSo(){
        PhanSo sum = new PhanSo();
        for(PhanSo ps : list){
            sum = sum.add(ps);
        }
        sum.reduceFraction();
        return sum;
    }

    public PhanSo findMaxPhanSoOptimize(){
        return this.list.stream().max((p,q ) -> p.comparePhanSo(q)).get();
    }

    public PhanSo findMax(){
        PhanSo max = list.get(0);
        for(PhanSo ps : list){
            if(max.comparePhanSo(ps) < 0){
                max = ps;
            }
        }

        return max;
    }

    public PhanSo findMin(){
        PhanSo min = list.get(0);
        for(PhanSo ps : list){
            if(min.comparePhanSo(ps) > 0){
                min = ps;
            }
        }

        return min;
    }

    public void arrangeList(){
        for (int i = 1; i < list.size() ; i ++){
            PhanSo x = list.get(i);
            int j = i-1;
            while(j >= 0 && list.get(j).comparePhanSo(x) > 0){
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, x);
        }
    }

    // dùng Collections
    public void sortList() {
        Collections.sort(list, (ps1, ps2) -> {
            int left = ps1.getTuSo() * ps2.getMauSo();
            int right = ps2.getTuSo() * ps1.getMauSo();
            return Integer.compare(left, right);
        });
    }
}