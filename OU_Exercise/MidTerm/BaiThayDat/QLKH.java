package OU_Exercise.MidTerm.BaiThayDat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class QLKH {
    private ArrayList<KhachHang> list;

    public QLKH(String path){
        list = new ArrayList<>();   
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            br.readLine(); //bỏ qua dòng thứ nhất
            br.readLine(); // bỏ qua dòng thứ hai 

            String lines;

            while ((lines = br.readLine()) != null){
                String[] parts = lines.trim().split(",\\s*");
                    int len = parts.length;
                switch (len) {
                    case 3 -> {
                        list.add(new KhachHang(parts[0], parts[1], Double.parseDouble(parts[2])));
                    }
                    case 4 ->{
                        list.add(new KhachHangVip(parts[0], parts[1], Double.parseDouble(parts[2]), parts[3]));
                    }
                    default ->{
                        System.out.println(lines);
                        System.out.println(len);
                        System.out.println("Không xác định");
                    }
                }
            }
        }
        catch (IOException e) {
            System.out.println("Lỗi I/O: " + e.getMessage());
        }

    }

    @Override
    public String toString() {
        return list.stream().map(KhachHang::toString).collect(Collectors.joining("\n"));
    }

    public void searchName(String keyword){
        KhachHang kh = list.stream().filter(k->k.getName().equals(keyword) || k.getName().toLowerCase().contains(keyword.toLowerCase())).findFirst().orElse(null);
        if (kh == null){
            System.out.println("Không tìm thấy");
            return;
        }
        System.out.println(kh.toString());
    }

    public void sort(){
        list.sort(Comparator.comparing(KhachHang::getBalance).reversed());
    }

    public void inputFileTop10(){
        ArrayList<KhachHang> dummy = new ArrayList<>(list);
        dummy.sort(Comparator.comparing(KhachHang::getBalance).reversed());
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("OU_Exercise/MidTerm/BaiThayDat/DeBai/Top10.txt"))){
            for (int i = 0;i<10;i++){
                KhachHang kh = dummy.get(i);
                String w;
                if (kh instanceof KhachHangVip){
                    KhachHangVip k = (KhachHangVip) kh;
                    w = k.getName() +", " + k.getSinh() +", "+ k.getBalance() +", "+k.getExpirationDate();
                    bw.write(w+"\n");
                    continue;
                } 
                w = kh.getName() +", " +kh.getSinh() +", "+kh.getBalance();
                bw.write(w+"\n");
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<KhachHang> getList() {
        return list;
    }

    public void setList(ArrayList<KhachHang> list) {
        this.list = list;
    }

    
}
