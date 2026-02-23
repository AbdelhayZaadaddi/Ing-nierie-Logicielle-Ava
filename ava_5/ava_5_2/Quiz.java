package ava_5.ava_5_2;

import java.util.Vector;

public class Quiz {
    private String question;
    private String answer;
    private Vector<String> options;

    public Quiz(String question, String answer, Vector<String> options) {
        this.question = question;
        this.answer = answer;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public Vector<String> getOptions() {
        return options;
    }
}
