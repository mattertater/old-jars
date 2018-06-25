/*
 * Decompiled with CFR 0_123.
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MiniQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Question q1 = new Question("What is the capital of Jamaica?", "Kingston");
        q1.setComplexity(4);
        Question q2 = new Question("Which is worse, ignorance or apathy?", "Screw you");
        q2.setComplexity(10);
        MiniQuiz.askQuestion(q1);
        MiniQuiz.askQuestion(q2);
    }

    private static void askQuestion(Question question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question.getQuestion());
        System.out.println(" (Level: " + question.getComplexity() + ")");
        String possible = scan.nextLine();
        if (question.answerCorrect(possible)) {
            System.out.println("Correct");
        } else {
            System.out.println("No, the answer is " + question.getAnswer());
        }
    }
}
