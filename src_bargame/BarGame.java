/*
 * Decompiled with CFR 0_123.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BarGame
extends JFrame {
    private JButton barOne;
    private JButton barTwo;
    private JButton barThree;
    private JButton barFour;
    private JButton barFive;
    private JButton barSix;
    private JButton barSeven;
    private JButton barEight;
    private JButton red;
    private JButton orange;
    private JButton yellow;
    private JButton green;
    private JButton cyan;
    private JButton black;
    private JButton magenta;
    private JButton top;
    private static JLabel highScore;
    private static JLabel currentScore;
    public static JButton[] buttons;
    private static boolean isOne;
    private static boolean isTwo;
    private static boolean isThree;
    private static boolean isFour;
    private static boolean isFive;
    private static boolean isSix;
    private static boolean isSeven;
    private static boolean isEight;
    private static int speed;
    private static int current;
    private static int high;
    static Color color;
    static Color color2;
    private static boolean isTop;

    static {
        buttons = new JButton[9];
        isOne = false;
        isTwo = false;
        isThree = false;
        isFour = false;
        isFive = false;
        isSix = false;
        isSeven = false;
        isEight = false;
        speed = 1500;
        current = 0;
        high = 0;
        color = Color.black;
        color2 = Color.white;
        isTop = true;
    }

    public BarGame(String title, int width, int height) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        super(title);
        this.setLayout(null);
        this.setBounds(0, 0, width, height);
        try {
            File background = new File("H:\\Java\\GUIStuff\\backgroudn.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(background);
            Clip Background = AudioSystem.getClip();
            Background.open(audioIn);
            Background.start();
        }
        catch (UnsupportedAudioFileException e1) {
            e1.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
        catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        this.barOne = new JButton();
        this.barOne.setBounds(25, 25, 100, 225);
        this.barOne.setBackground(Color.white);
        this.barOne.addActionListener(new buttonOne(this, null));
        this.add(this.barOne);
        BarGame.buttons[1] = this.barOne;
        this.barTwo = new JButton();
        this.barTwo.setBounds(125, 25, 100, 225);
        this.barTwo.setBackground(Color.white);
        this.barTwo.addActionListener(new buttonTwo(this, null));
        this.add(this.barTwo);
        BarGame.buttons[2] = this.barTwo;
        this.barThree = new JButton();
        this.barThree.setBounds(225, 25, 100, 225);
        this.barThree.setBackground(Color.white);
        this.barThree.addActionListener(new buttonThree(this, null));
        this.add(this.barThree);
        BarGame.buttons[3] = this.barThree;
        this.barFour = new JButton();
        this.barFour.setBounds(325, 25, 100, 225);
        this.barFour.setBackground(Color.white);
        this.barFour.addActionListener(new buttonFour(this, null));
        this.add(this.barFour);
        BarGame.buttons[4] = this.barFour;
        this.barFive = new JButton();
        this.barFive.setBounds(425, 25, 100, 225);
        this.barFive.setBackground(Color.white);
        this.barFive.addActionListener(new buttonFive(this, null));
        this.add(this.barFive);
        BarGame.buttons[5] = this.barFive;
        this.barSix = new JButton();
        this.barSix.setBounds(525, 25, 100, 225);
        this.barSix.setBackground(Color.white);
        this.barSix.addActionListener(new buttonSix(this, null));
        this.add(this.barSix);
        BarGame.buttons[6] = this.barSix;
        this.barSeven = new JButton();
        this.barSeven.setBounds(625, 25, 100, 225);
        this.barSeven.setBackground(Color.white);
        this.barSeven.addActionListener(new buttonSeven(this, null));
        this.add(this.barSeven);
        BarGame.buttons[7] = this.barSeven;
        this.barEight = new JButton();
        this.barEight.setBounds(725, 25, 100, 225);
        this.barEight.setBackground(Color.white);
        this.barEight.addActionListener(new buttonEight(this, null));
        this.add(this.barEight);
        BarGame.buttons[8] = this.barEight;
        this.top = new JButton("Top");
        this.top.setBounds(25, 275, 100, 100);
        this.top.addActionListener(new bottom(this, null));
        this.add(this.top);
        this.red = new JButton();
        this.red.setBounds(125, 275, 100, 100);
        this.red.setBackground(Color.red);
        this.red.addActionListener(new changeRed(this, null));
        this.add(this.red);
        this.orange = new JButton();
        this.orange.setBounds(225, 275, 100, 100);
        this.orange.setBackground(Color.orange);
        this.orange.addActionListener(new changeOrange(this, null));
        this.add(this.orange);
        this.yellow = new JButton();
        this.yellow.setBounds(325, 275, 100, 100);
        this.yellow.setBackground(Color.yellow);
        this.yellow.addActionListener(new changeYellow(this, null));
        this.add(this.yellow);
        this.green = new JButton();
        this.green.setBounds(425, 275, 100, 100);
        this.green.setBackground(Color.green);
        this.green.addActionListener(new changeGreen(this, null));
        this.add(this.green);
        this.cyan = new JButton();
        this.cyan.setBounds(525, 275, 100, 100);
        this.cyan.setBackground(Color.cyan);
        this.cyan.addActionListener(new changeCyan(this, null));
        this.add(this.cyan);
        this.magenta = new JButton();
        this.magenta.setBounds(625, 275, 100, 100);
        this.magenta.setBackground(Color.magenta);
        this.magenta.addActionListener(new changeMagenta(this, null));
        this.add(this.magenta);
        this.black = new JButton();
        this.black.setBounds(725, 275, 100, 100);
        this.black.setBackground(Color.black);
        this.black.addActionListener(new changeBlack(this, null));
        this.add(this.black);
        currentScore = new JLabel("Current Score: ");
        currentScore.setBounds(25, 375, 100, 50);
        this.add(currentScore);
        highScore = new JLabel("High Score: ");
        highScore.setBounds(25, 405, 100, 50);
        this.add(highScore);
    }

    public void play() {
        int i = 1;
        while (i < 9) {
            if (!isOne) {
                this.barOne.setBackground(color2);
            }
            if (!isTwo) {
                this.barTwo.setBackground(color2);
            }
            if (!isThree) {
                this.barThree.setBackground(color2);
            }
            if (!isFour) {
                this.barFour.setBackground(color2);
            }
            if (!isFive) {
                this.barFive.setBackground(color2);
            }
            if (!isSix) {
                this.barSix.setBackground(color2);
            }
            if (!isSeven) {
                this.barSeven.setBackground(color2);
            }
            if (!isEight) {
                this.barEight.setBackground(color2);
            }
            highScore.setText("High Score: " + high);
            currentScore.setText("Current score: " + current);
            buttons[i].setBackground(color);
            if (i != 1) {
                buttons[i - 1].setBackground(color2);
            }
            isOne = false;
            isTwo = false;
            isThree = false;
            isFour = false;
            isFive = false;
            isSix = false;
            isSeven = false;
            isEight = false;
            switch (i) {
                case 1: {
                    isOne = true;
                    break;
                }
                case 2: {
                    isTwo = true;
                    break;
                }
                case 3: {
                    isThree = true;
                    break;
                }
                case 4: {
                    isFour = true;
                    break;
                }
                case 5: {
                    isFive = true;
                    break;
                }
                case 6: {
                    isSix = true;
                    break;
                }
                case 7: {
                    isSeven = true;
                    break;
                }
                case 8: {
                    isEight = true;
                }
            }
            try {
                Thread.sleep(speed);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 8) {
                buttons[i].setBackground(color2);
                i = 0;
            }
            ++i;
        }
    }

    public static void onHit() {
        try {
            File good = new File("H:\\Java\\GUIStuff\\goodhit.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(good);
            Clip Good = AudioSystem.getClip();
            Good.open(audioIn);
            Good.start();
        }
        catch (UnsupportedAudioFileException e1) {
            e1.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
        catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void offHit() {
        try {
            File bad = new File("H:\\Java\\GUIStuff\\badHit.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(bad);
            Clip Bad = AudioSystem.getClip();
            Bad.open(audioIn);
            Bad.start();
        }
        catch (UnsupportedAudioFileException e1) {
            e1.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
        catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        BarGame frame = new BarGame("Matt's Bar Game", 875, 500);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.play();
    }

    static /* synthetic */ void access$2(boolean bl) {
        isTop = bl;
    }

    static /* synthetic */ void access$5(int n) {
        current = n;
    }

    static /* synthetic */ void access$7(int n) {
        high = n;
    }

    static /* synthetic */ void access$9(int n) {
        speed = n;
    }

    private class bottom
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private bottom(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isTop) {
                this.this$0.top.setText("Bottom");
                BarGame.access$2(false);
            } else {
                this.this$0.top.setText("Top");
                BarGame.access$2(true);
            }
        }

        /* synthetic */ bottom(BarGame barGame, bottom bottom2) {
            bottom bottom3;
            bottom3(barGame);
        }
    }

    private class buttonEight
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private buttonEight(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isEight) {
                BarGame.access$5(current + 1);
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$9(speed - (speed / 2 - speed / 3));
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.onHit();
            } else {
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$5(0);
                BarGame.access$9(1500);
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.offHit();
            }
        }

        /* synthetic */ buttonEight(BarGame barGame, buttonEight buttonEight2) {
            buttonEight buttonEight3;
            buttonEight3(barGame);
        }
    }

    private class buttonFive
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private buttonFive(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isFive) {
                BarGame.access$5(current + 1);
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$9(speed - (speed / 2 - speed / 3));
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.onHit();
            } else {
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$5(0);
                BarGame.access$9(1500);
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.offHit();
            }
        }

        /* synthetic */ buttonFive(BarGame barGame, buttonFive buttonFive2) {
            buttonFive buttonFive3;
            buttonFive3(barGame);
        }
    }

    private class buttonFour
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private buttonFour(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isFour) {
                BarGame.access$5(current + 1);
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$9(speed - (speed / 2 - speed / 3));
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.onHit();
            } else {
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$5(0);
                BarGame.access$9(1500);
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.offHit();
            }
        }

        /* synthetic */ buttonFour(BarGame barGame, buttonFour buttonFour2) {
            buttonFour buttonFour3;
            buttonFour3(barGame);
        }
    }

    private class buttonOne
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private buttonOne(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isOne) {
                BarGame.access$5(current + 1);
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$9(speed - (speed / 2 - speed / 3));
                BarGame.onHit();
            } else {
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$5(0);
                BarGame.access$9(1500);
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.offHit();
            }
        }

        /* synthetic */ buttonOne(BarGame barGame, buttonOne buttonOne2) {
            buttonOne buttonOne3;
            buttonOne3(barGame);
        }
    }

    private class buttonSeven
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private buttonSeven(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isSeven) {
                BarGame.access$5(current + 1);
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$9(speed - (speed / 2 - speed / 3));
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.onHit();
            } else {
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$5(0);
                BarGame.access$9(1500);
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.offHit();
            }
        }

        /* synthetic */ buttonSeven(BarGame barGame, buttonSeven buttonSeven2) {
            buttonSeven buttonSeven3;
            buttonSeven3(barGame);
        }
    }

    private class buttonSix
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private buttonSix(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isSix) {
                BarGame.access$5(current + 1);
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$9(speed - (speed / 2 - speed / 3));
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.onHit();
            } else {
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$5(0);
                BarGame.access$9(1500);
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.offHit();
            }
        }

        /* synthetic */ buttonSix(BarGame barGame, buttonSix buttonSix2) {
            buttonSix buttonSix3;
            buttonSix3(barGame);
        }
    }

    private class buttonThree
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private buttonThree(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isThree) {
                BarGame.access$5(current + 1);
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$9(speed - (speed / 2 - speed / 3));
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.onHit();
            } else {
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$5(0);
                BarGame.access$9(1500);
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.offHit();
            }
        }

        /* synthetic */ buttonThree(BarGame barGame, buttonThree buttonThree2) {
            buttonThree buttonThree3;
            buttonThree3(barGame);
        }
    }

    private class buttonTwo
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private buttonTwo(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isTwo) {
                BarGame.access$5(current + 1);
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$9(speed - (speed / 2 - speed / 3));
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.onHit();
            } else {
                if (current > high) {
                    BarGame.access$7(current);
                }
                BarGame.access$5(0);
                BarGame.access$9(1500);
                highScore.setText("High Score: " + high);
                currentScore.setText("Current score: " + current);
                BarGame.offHit();
            }
        }

        /* synthetic */ buttonTwo(BarGame barGame, buttonTwo buttonTwo2) {
            buttonTwo buttonTwo3;
            buttonTwo3(barGame);
        }
    }

    private class changeBlack
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private changeBlack(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isTop) {
                BarGame.color = Color.black;
            } else {
                BarGame.color2 = Color.black;
            }
        }

        /* synthetic */ changeBlack(BarGame barGame, changeBlack changeBlack2) {
            changeBlack changeBlack3;
            changeBlack3(barGame);
        }
    }

    private class changeCyan
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private changeCyan(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isTop) {
                BarGame.color = Color.cyan;
            } else {
                BarGame.color2 = Color.cyan;
            }
        }

        /* synthetic */ changeCyan(BarGame barGame, changeCyan changeCyan2) {
            changeCyan changeCyan3;
            changeCyan3(barGame);
        }
    }

    private class changeGreen
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private changeGreen(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isTop) {
                BarGame.color = Color.green;
            } else {
                BarGame.color2 = Color.green;
            }
        }

        /* synthetic */ changeGreen(BarGame barGame, changeGreen changeGreen2) {
            changeGreen changeGreen3;
            changeGreen3(barGame);
        }
    }

    private class changeMagenta
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private changeMagenta(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isTop) {
                BarGame.color = Color.magenta;
            } else {
                BarGame.color2 = Color.magenta;
            }
        }

        /* synthetic */ changeMagenta(BarGame barGame, changeMagenta changeMagenta2) {
            changeMagenta changeMagenta3;
            changeMagenta3(barGame);
        }
    }

    private class changeOrange
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private changeOrange(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isTop) {
                BarGame.color = Color.orange;
            } else {
                BarGame.color2 = Color.orange;
            }
        }

        /* synthetic */ changeOrange(BarGame barGame, changeOrange changeOrange2) {
            changeOrange changeOrange3;
            changeOrange3(barGame);
        }
    }

    private class changeRed
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private changeRed(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isTop) {
                BarGame.color = Color.red;
            } else {
                BarGame.color2 = Color.red;
            }
        }

        /* synthetic */ changeRed(BarGame barGame, changeRed changeRed2) {
            changeRed changeRed3;
            changeRed3(barGame);
        }
    }

    private class changeYellow
    implements ActionListener {
        final /* synthetic */ BarGame this$0;

        private changeYellow(BarGame barGame) {
            this.this$0 = barGame;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (isTop) {
                BarGame.color = Color.yellow;
            } else {
                BarGame.color2 = Color.yellow;
            }
        }

        /* synthetic */ changeYellow(BarGame barGame, changeYellow changeYellow2) {
            changeYellow changeYellow3;
            changeYellow3(barGame);
        }
    }

}
