/*
 * Decompiled with CFR 0_123.
 */
import javax.swing.JOptionPane;

public class CircleArea {
    public static void main(String[] args) {
        String inputStr = JOptionPane.showInputDialog("Enter a radius for a circle", (Object)"");
        if (inputStr == null) {
            return;
        }
        double radius = Integer.parseInt(inputStr);
        if (radius <= 0.0) {
            JOptionPane.showMessageDialog(null, "Has to be greater than 0, stupid.");
        } else {
            double area = radius * 3.1415926 * radius;
            JOptionPane.showMessageDialog(null, "A circle with a radius of " + radius + " has an area\nof " + area);
        }
    }
}
