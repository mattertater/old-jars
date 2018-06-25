/*
 * Decompiled with CFR 0_123.
 */
import javax.swing.JOptionPane;

public class Age {
    public static void main(String[] args) {
        String inputStr = JOptionPane.showInputDialog("Enter your age in whole years", (Object)"");
        if (inputStr == null) {
            return;
        }
        int age = Integer.parseInt(inputStr);
        if (age <= 0) {
            JOptionPane.showMessageDialog(null, "You were born weren't you?");
        } else {
            int days = age * 365;
            JOptionPane.showMessageDialog(null, "You are at least " + days + " days old.");
        }
    }
}
