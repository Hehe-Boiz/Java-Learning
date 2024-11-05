package exercise8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.Random;

public class EnglishApp {
    private static final String QUESTION_FOLDER = "/home/heheboiz/Java/OOP-Learning/OU_Exercise/BTTH2/exercise8/CauHoi";
    static Scanner sc = new Scanner(System.in);

    private static List<Question> loadQuestions(){
        List<Question> questions = new ArrayList<>();
        
        File directory = new File(QUESTION_FOLDER);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String content = br.readLine();
                    
                    List<String> options = new ArrayList<>();
                    for(int i =0 ;i<4;i++){
                        options.add(br.readLine());
                    }
                    String[] correctAnswers = br.readLine().split("[\\s+]");
                    for (int i = 0; i < correctAnswers.length; i++) {
                        correctAnswers[i] = correctAnswers[i].toLowerCase();
                    }
                    questions.add(new Question(content, options, Arrays.asList(correctAnswers)));
                    br.close();
                } catch (IOException e) {
                    System.err.println("Lỗi khi đọc file: " + file.getName() + " - " + e.getMessage());
                }
            }
        }
        else {
            System.out.println("Không tìm thấy câu hỏi nào trong thư mục " + QUESTION_FOLDER);
        }

        return questions;
    }

    private static void addQuestions(){
        System.out.println("Nhập nội dung câu hỏi: ");
        String content = sc.nextLine();

        List<String> options = new ArrayList<>();
        System.out.println("Nhập 4 lựa chọn:");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Lựa chọn " + i + ": ");
            options.add(sc.nextLine());
        }

        System.out.println("Nhập đáp án đúng: ");
        String[] correctAnswers = sc.nextLine().toUpperCase().split("\\s+,\\s+");

        UUID uuid = UUID.randomUUID();
        String fileName = QUESTION_FOLDER + "/" + uuid + ".txt";

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
            writer.newLine();
            for (String option : options) {
                writer.write(option);
                writer.newLine();
            }
            writer.write(String.join(",", correctAnswers));
            System.out.println("Câu hỏi đã được lưu vào file: " + fileName);
            writer.close();
        } catch (IOException e) {
            System.err.println("Lỗi khi lưu câu hỏi: " + e.getMessage());
        }
    }


    private static void showQuestions(){
        System.out.println("Mời bạn nhập số lượng câu hỏi muốn luyện tập: ");
        int n = Integer.parseInt(sc.nextLine());

        List<Question> questions = loadQuestions();
        Random rand = new Random();

        for(int i = 0 ; i<n ;i++){
            int randomIndex = rand.nextInt(questions.size());
            Question randomElement = questions.get(randomIndex);
            questions.remove(randomElement);

            System.out.println(randomElement.getContent());
            List<String> options = randomElement.getOptions();

            for (String op : options){
                System.out.println(op);
            }

            System.out.println("Mời bạn nhập câu trả lời: ");
            String anwser = sc.nextLine().toLowerCase();

            while(!randomElement.getCorrectAnswers().contains(anwser)){
                System.out.println("Bạn đã nhập sai vui lòng nhập lại: ");
                anwser = sc.nextLine().toLowerCase();
            }
        }
    } 

    public static void main(String[] args) {
        int n = 0;
        while (n != 3) {
            System.out.println("1. Thêm câu hỏi mới ");
            System.out.println("2. Luyện tập ");
            System.out.println("3. Thoát chương trình ");
            System.out.println("Mời bạn lựa chọn: ");

            n = Integer.parseInt(sc.nextLine());
            if(n == 1) addQuestions();
            else if(n == 2) showQuestions();
            else if(n > 3) System.out.println("Nhập không hợp lệ!");
        }
        

    }
}
