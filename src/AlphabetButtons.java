/*
 * Decompiled with CFR 0_123.
 */
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AlphabetButtons
extends JFrame {
    public AlphabetButtons(int width, int height) {
        super("Alphabet Buttons");
        this.setLayout(new GridLayout(6, 5));
        this.setBounds(0, 0, width, height);
        int i = 0;
        while (i < 26) {
            Character letter = Character.valueOf((char)(i + 65));
            JButton button = new JButton(letter.toString());
            this.add(button);
            ++i;
        }
    }

    public static void main(String[] args) {
        AlphabetButtons frame = new AlphabetButtons(100, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
