package exercise8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishApp {
    private static final String QUESTION_FOLDER = "CauHoi";

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
                    String[] correctAnswers = br.readLine().split("\\s*");
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
}
