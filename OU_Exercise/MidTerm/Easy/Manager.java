package OU_Exercise.MidTerm.Easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {
    private List<Learner> listLearners = new ArrayList<>();
    

    public void addLearner(Learner learner){
        listLearners.add(learner);
    }

    public void cardRegistration(Learner learner,LibaryCard libaryCard){
        learner.getList().add(libaryCard);
    }

    public void display(){
        listLearners.forEach(l -> System.out.println(l));
    }

    public void displayLearnerMonth12(){
        List<Learner> dummy = listLearners.stream().filter(l -> (l.getDate().getMonthValue()) == 12).collect(Collectors.toList());
        if(dummy != null){
            dummy.sort(Comparator.comparing(Learner::getDate));
            dummy.forEach(l -> System.out.println(l));
            return;
        }
        System.out.println("Không có ai sinh tháng 12");
        
    }

    public void searchLearnerDisplayCard(String ms){
        Learner learner = listLearners.stream().filter(l -> l.getId().equals(ms)).findFirst().orElse(null);
        if(learner == null || learner.getList() == null){
            System.out.println("Không tìm thấy người học hoặc chưa đăng kí thẻ");
        }
        learner.getList().stream().forEach(c -> {
            System.out.println(c);
            String s = "Chưa hết hạn";
            if (c.isCheckDay()){
                s = "Đã hết hạn";
            }
            System.out.println("Tình trạng: "+s);
        });
    }

    public void displayLearner(String ms){
        Learner learner = listLearners.stream().filter(l -> l.getId().equals(ms)).findFirst().orElse(null);
        if(learner == null){
            System.out.println("Không tìm thấy người học");
            return;
        }
        System.out.println(learner);
    }

    public void displayLearnerYear2024(){
        listLearners.stream().filter(l -> l.isCheckYear2024()).forEach(f -> {
            System.out.println(f);
            f.getList().forEach(c -> System.out.println(c));
        });
    }

    public void sort(){
        listLearners.sort(Comparator.comparing(Learner::getDate).reversed().thenComparing(Comparator.comparing(Learner::getName)));
        this.display();
    }

    
}
