/*
 * Decompiled with CFR 0_123.
 */
public class Question
implements Complexity {
    private String question;
    private String answer;
    private int complexityLevel;

    public Question(String query, String result) {
        this.question = query;
        this.answer = result;
        this.complexityLevel = 1;
    }

    @Override
    public void setComplexity(int level) {
        this.complexityLevel = level;
    }

    @Override
    public int getComplexity() {
        return this.complexityLevel;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public boolean answerCorrect(String candidateAnswer) {
        return this.answer.equalsIgnoreCase(candidateAnswer);
    }

    public String toString() {
        return String.valueOf(this.question) + "\n" + this.answer;
    }
}
