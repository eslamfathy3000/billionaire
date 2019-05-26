package me.eslamfathy.billionaire.model;

import java.util.Map;

public class Question {
    private String statement;
    private Map choices;
    private Integer correctAnswer;
    private String answerExplanation;
    private Prize prize;

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Map getChoices() {
        return choices;
    }

    public void setChoices(Map choices) {
        this.choices = choices;
    }

    public Integer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Integer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getAnswerExplanation() {
        return answerExplanation;
    }

    public void setAnswerExplanation(String answerExplanation) {
        this.answerExplanation = answerExplanation;
    }

    public Prize getPrize() {
        return prize;
    }

    public void setPrize(Prize prize) {
        this.prize = prize;
    }
}
