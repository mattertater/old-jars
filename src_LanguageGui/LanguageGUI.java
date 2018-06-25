/*
 * Decompiled with CFR 0_123.
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LanguageGUI
extends JFrame {
    private JLabel inputL;
    private JLabel keyL;
    private JLabel outputL;
    private JLabel iterationL;
    private static JTextField input;
    private static JTextField key;
    private static JTextField iteration;
    private JButton code;
    private JButton decode;
    private JButton copyPaste;
    private JButton clipboard;
    private static JTextField outputA;
    private static JComboBox keyList;

    public LanguageGUI() {
        super("Matt's Encryptor");
        this.setLayout(null);
        this.inputL = new JLabel("Input: ");
        this.inputL.setBounds(5, 5, 50, 15);
        this.add(this.inputL);
        input = new JTextField(20);
        input.setBounds(45, 3, 235, 23);
        this.add(input);
        this.keyL = new JLabel("Key: ");
        this.keyL.setBounds(30, 30, 50, 15);
        this.add(this.keyL);
        String[] list = new String[]{"Alpha", "Delta", "Omega", "Gamma", "\u03bc"};
        keyList = new JComboBox<String>(list);
        keyList.setBounds(60, 28, 70, 23);
        keyList.addActionListener(new KeyListener());
        this.add(keyList);
        this.iterationL = new JLabel("Iterations: ");
        this.iterationL.setBounds(150, 30, 70, 15);
        this.add(this.iterationL);
        iteration = new JTextField(3);
        iteration.setBounds(210, 28, 50, 23);
        this.add(iteration);
        this.code = new JButton("Encrypt");
        this.code.setBounds(40, 55, 90, 25);
        this.code.addActionListener(new EncryptAction());
        this.add(this.code);
        this.decode = new JButton("Decrypt");
        this.decode.setBounds(155, 55, 90, 25);
        this.decode.addActionListener(new DecryptAction());
        this.add(this.decode);
        this.outputL = new JLabel("Output: ");
        this.outputL.setBounds(5, 90, 50, 15);
        this.add(this.outputL);
        outputA = new JTextField();
        outputA.setBounds(50, 90, 225, 19);
        outputA.setEditable(false);
        this.add(outputA);
        this.copyPaste = new JButton("Copy output to input");
        this.copyPaste.setBounds(75, 115, 150, 25);
        this.copyPaste.addActionListener(new CopyOutput());
        this.add(this.copyPaste);
        this.clipboard = new JButton("Copy output to clipboard");
        this.clipboard.setBounds(60, 143, 180, 25);
        this.clipboard.addActionListener(new Clipboard());
        this.add(this.clipboard);
    }

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double monitorWidth = screenSize.getWidth();
        double monitorHeight = screenSize.getHeight();
        int width = 300;
        int height = 200;
        LanguageGUI frame = new LanguageGUI();
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds((int)(monitorWidth / 2.0 - (double)(width / 2)), (int)(monitorHeight / 2.0 - (double)(height / 2)), width, height);
    }

    static /* synthetic */ JTextField access$2() {
        return iteration;
    }

    static class Clipboard
    implements ActionListener {
        Clipboard() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            StringSelection selection = new StringSelection(outputA.getText());
            java.awt.datatransfer.Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(selection, null);
        }
    }

    static class CopyOutput
    implements ActionListener {
        CopyOutput() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            input.setText(outputA.getText());
        }
    }

    static class DecryptAction
    implements ActionListener {
        DecryptAction() {
        }

        /*
         * Exception decompiling
         */
        @Override
        public void actionPerformed(ActionEvent e) {
          // DECOMPILATION FAILED, VAR AND CLASS NAMES MAY NOT MATCH
          // String in = LanguageGUI.input.getText();String output = "";
          //   int k = 1;int q = 1;
          //   String str1;
          //   switch ((str1 = LanguageGUI.keyList.getSelectedItem().toString()).hashCode()) {case 956:  if (str1.equals("μ")) {} break; case 63357246:  if (str1.equals("Alpha")) break; break; case 65915800:  if (str1.equals("Delta")) {} break; case 68567943:  if (str1.equals("Gamma")) {} break; case 76305729:  if (!str1.equals("Omega")) { break label175;
          //       k = 3;
          //       break label175; k = 5;
          //     } else { k = 9;
          //       break label175; k = 11;
          //       break label175; k = 100; }
          //     break; }
          //   label175:
          //   if (LanguageGUI.iteration.getText().equals("")) {
          //     q = 1;
          //   } else {
          //     q = Integer.parseInt(LanguageGUI.iteration.getText());
          //   }
          //   for (int w = 0; w < q; w++) {
          //     if (!output.equalsIgnoreCase(""))
          //       in = output;
          //     output = "";
          //     for (int i = 0; i < in.length(); i++) {
          //       char current = in.charAt(i);
          //       int ascii = current;
          //
          //       if (k == 0) {
          //         ascii -= 100;
          //       } else {
          //         ascii -= k;
          //       }
          //       char charOut = (char)ascii;
          //       output = output + charOut;
          //     }
          //   }
          //
          //   LanguageGUI.outputA.setText(output);
        }
    }

    static class EncryptAction
    implements ActionListener {
        EncryptAction() {
        }

        /*
         * Exception decompiling
         */
        @Override
        public void actionPerformed(ActionEvent e) {
          // DECOMPILATION FAILED, VAR AND CLASS NAMES MAY NOT MATCH
          // String in = LanguageGUI.input.getText();String output = "";
          //   int k = 1;int q = 1;
          //   String str1;
          //   switch ((str1 = LanguageGUI.keyList.getSelectedItem().toString()).hashCode()) {case 956:  if (str1.equals("μ")) {} break; case 63357246:  if (str1.equals("Alpha")) break; break; case 65915800:  if (str1.equals("Delta")) {} break; case 68567943:  if (str1.equals("Gamma")) {} break; case 76305729:  if (!str1.equals("Omega")) { break label175;
          //       k = 3;
          //       break label175; k = 5;
          //     } else { k = 9;
          //       break label175; k = 11;
          //       break label175; k = 100; }
          //     break; }
          //   label175:
          //   if (LanguageGUI.iteration.getText().equals("")) {
          //     q = 1;
          //   } else {
          //     q = Integer.parseInt(LanguageGUI.iteration.getText());
          //   }
          //   for (int w = 0; w < q; w++) {
          //     if (!output.equalsIgnoreCase(""))
          //       in = output;
          //     output = "";
          //     for (int i = 0; i < in.length(); i++) {
          //       char current = in.charAt(i);
          //       int ascii = current;
          //
          //       if (k == 0) {
          //         ascii += 100;
          //       } else {
          //         ascii += k;
          //       }
          //       char charOut = (char)ascii;
          //       output = output + charOut;
          //     }
          //   }
          //   LanguageGUI.outputA.setText(output);
        }
    }

    static class KeyListener
    implements ActionListener {
        KeyListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String string = keyList.getSelectedItem().toString();
            switch (string.hashCode()) {
                case 63357246: {
                    if (!string.equals("Alpha")) {
                        // empty if block
                    } else {
                        break;
                    }
                }
            }
        }
    }

}
