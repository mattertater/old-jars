/*
 * Decompiled with CFR 0_123.
 */
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutManager
extends JFrame {
    public NoLayoutManager() {
        super("No Layout Manager");
        this.setLayout(null);
        this.setBounds(0, 0, 300, 300);
        JButton picture = new JButton(new ImageIcon("smiley.jpg"));
        JButton smile = new JButton(":)");
        JButton frown = new JButton(":(");
        picture.setBounds(125, 125, 100, 50);
        smile.setBounds(30, 30, 50, 50);
        frown.setBounds(220, 30, 50, 50);
        this.add(picture);
        this.add(smile);
        this.add(frown);
    }

    public static void main(String[] args) {
        NoLayoutManager frame = new NoLayoutManager();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}
