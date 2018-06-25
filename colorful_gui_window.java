/*
 * Decompiled with CFR 0_123.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ColorfulGUIWindow {
    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("Matt's Colorful Grid");
        String input = JOptionPane.showInputDialog("Number of Columns", (Object)null);
        if (input == null) {
            return;
        }
        int rows = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Number of Columns", (Object)null);
        if (input == null) {
            return;
        }
        int cols = Integer.parseInt(input);
        theGUI.setSize(cols * 10, rows * 10);
        theGUI.setDefaultCloseOperation(3);
        Container pane = theGUI.getContentPane();
        pane.setLayout(new GridLayout(rows, cols));
        Random random = new Random();
        int i = 1;
        while (i <= rows * cols) {
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color backColor = new Color(red, green, blue);
            ColorPanel panel = new ColorPanel(backColor, cols, rows);
            pane.add(panel);
            ++i;
        }
        theGUI.setVisible(true);
    }
}
