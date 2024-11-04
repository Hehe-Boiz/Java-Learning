package exercise8;

import java.util.List;

public class Question {
    private String content;
    private List<String> options;
    private List<String> correctAnswers;

    public Question(String content, List<String> options, List<String> correctAnswers) {
        this.content = content;
        this.options = options;
        this.correctAnswers = correctAnswers;
    }

    public String getContent() {
        return content;
    }

    public List<String> getOptions() {
        return options;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public boolean checkAnswer(String answer) {
        return correctAnswers.contains(answer.toUpperCase());
    }
}
