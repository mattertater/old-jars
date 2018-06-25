/*
 * Decompiled with CFR 0_123.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gold_collector
extends JFrame {
    private int gold_collected = 0;
    private int clickers = 0;
    private int mines = 0;
    private int jewelers = 0;
    private int pirates = 0;
    private int merchants = 0;
    private int forges = 0;
    private int gods = 0;
    private int clickerprice = 20;
    private int mineprice = 100;
    private int jewelerprice = 500;
    private int pirateprice = 2000;
    private int merchantprice = 10000;
    private int forgeprice = 100000;
    private int godprice = 9999999;
    private int tps = 0;
    private JLabel GPS;
    private JLabel gold;
    private JLabel labels;
    private JLabel clickerstats;
    private JLabel minestats;
    private JLabel jewelerstats;
    private JLabel piratestats;
    private JLabel merchantstats;
    private JLabel forgestats;
    private JLabel godstats;
    private JLabel labels_1;
    private JLabel clickerstats_1;
    private JLabel minestats_1;
    private JLabel jewelerstats_1;
    private JLabel piratestats_1;
    private JLabel merchantstats_1;
    private JLabel forgestats_1;
    private JLabel godstats_1;
    private JButton click;
    private JButton clicker;
    private JButton mine;
    private JButton jeweler;
    private JButton pirate;
    private JButton merchant;
    private JButton forge;
    private JButton god;
    private JButton sell_clicker;
    private JButton sell_mine;
    private JButton sell_jeweler;
    private JButton sell_pirate;
    private JButton sell_merchant;
    private JButton sell_forge;
    private JButton sell_god;

    public gold_collector(String title) {
        super(title);
        this.setLayout(null);
        this.setBounds(0, 0, 500, 220);
        this.gold = new JLabel("Gold: " + this.gold_collected);
        this.gold.setBounds(0, 0, 150, 15);
        this.add(this.gold);
        this.GPS = new JLabel("Gold per second: " + this.tps);
        this.GPS.setBounds(0, 20, 150, 15);
        this.add(this.GPS);
        this.labels = new JLabel("Cost");
        this.labels.setBounds(370, 10, 180, 20);
        this.add(this.labels);
        this.labels_1 = new JLabel("Owned");
        this.labels_1.setBounds(440, 10, 180, 20);
        this.add(this.labels_1);
        this.clickerstats = new JLabel("" + this.clickerprice);
        this.clickerstats.setBounds(370, 40, 180, 20);
        this.add(this.clickerstats);
        this.clickerstats_1 = new JLabel("" + this.clickers);
        this.clickerstats_1.setBounds(440, 40, 180, 20);
        this.add(this.clickerstats_1);
        this.minestats = new JLabel("" + this.mineprice);
        this.minestats.setBounds(370, 60, 180, 20);
        this.add(this.minestats);
        this.minestats_1 = new JLabel("" + this.mines);
        this.minestats_1.setBounds(440, 60, 180, 20);
        this.add(this.minestats_1);
        this.jewelerstats = new JLabel(String.valueOf(this.jewelerprice));
        this.jewelerstats.setBounds(370, 80, 180, 20);
        this.add(this.jewelerstats);
        this.jewelerstats_1 = new JLabel("" + this.jewelers);
        this.jewelerstats_1.setBounds(440, 80, 180, 20);
        this.add(this.jewelerstats_1);
        this.piratestats = new JLabel(String.valueOf(this.pirateprice));
        this.piratestats.setBounds(370, 100, 180, 20);
        this.add(this.piratestats);
        this.piratestats_1 = new JLabel("" + this.pirates);
        this.piratestats_1.setBounds(440, 100, 180, 20);
        this.add(this.piratestats_1);
        this.merchantstats = new JLabel(String.valueOf(this.merchantprice));
        this.merchantstats.setBounds(370, 120, 180, 20);
        this.add(this.merchantstats);
        this.merchantstats_1 = new JLabel("" + this.merchants);
        this.merchantstats_1.setBounds(440, 120, 180, 20);
        this.add(this.merchantstats_1);
        this.forgestats = new JLabel(String.valueOf(this.forgeprice));
        this.forgestats.setBounds(370, 140, 180, 20);
        this.add(this.forgestats);
        this.forgestats_1 = new JLabel("" + this.forges);
        this.forgestats_1.setBounds(440, 140, 180, 20);
        this.add(this.forgestats_1);
        this.godstats = new JLabel(String.valueOf(this.godprice));
        this.godstats.setBounds(370, 160, 180, 20);
        this.add(this.godstats);
        this.godstats_1 = new JLabel("" + this.gods);
        this.godstats_1.setBounds(440, 160, 180, 20);
        this.add(this.godstats_1);
        this.click = new JButton("Collect 1 Gold");
        this.click.setBounds(0, 40, 120, 140);
        this.click.addActionListener(new Click(this, null));
        this.add(this.click);
        this.clicker = new JButton("Clicker (1 gps)");
        this.clicker.setBounds(220, 40, 150, 20);
        this.clicker.addActionListener(new Clicker(this, null));
        this.add(this.clicker);
        this.sell_clicker = new JButton("Sell");
        this.sell_clicker.setBounds(120, 40, 100, 20);
        this.sell_clicker.addActionListener(new sell_Clicker(this, null));
        this.add(this.sell_clicker);
        this.mine = new JButton("Mine (5 gps)");
        this.mine.setBounds(220, 60, 150, 20);
        this.mine.addActionListener(new Mine(this, null));
        this.add(this.mine);
        this.sell_mine = new JButton("Sell");
        this.sell_mine.setBounds(120, 60, 100, 20);
        this.sell_mine.addActionListener(new sell_Mine(this, null));
        this.add(this.sell_mine);
        this.jeweler = new JButton("Jeweler (20 gps)");
        this.jeweler.setBounds(220, 80, 150, 20);
        this.jeweler.addActionListener(new jeweler(this, null));
        this.add(this.jeweler);
        this.sell_jeweler = new JButton("Sell");
        this.sell_jeweler.setBounds(120, 80, 100, 20);
        this.sell_jeweler.addActionListener(new sell_jeweler(this, null));
        this.add(this.sell_jeweler);
        this.pirate = new JButton("Pirate (50 gps)");
        this.pirate.setBounds(220, 100, 150, 20);
        this.pirate.addActionListener(new Pirate(this, null));
        this.add(this.pirate);
        this.sell_pirate = new JButton("Sell");
        this.sell_pirate.setBounds(120, 100, 100, 20);
        this.sell_pirate.addActionListener(new sell_Pirate(this, null));
        this.add(this.sell_pirate);
        this.merchant = new JButton("Merchant (100 gps)");
        this.merchant.setBounds(220, 120, 150, 20);
        this.merchant.addActionListener(new merchant(this, null));
        this.add(this.merchant);
        this.sell_merchant = new JButton("Sell");
        this.sell_merchant.setBounds(120, 120, 100, 20);
        this.sell_merchant.addActionListener(new sell_merchant(this, null));
        this.add(this.sell_merchant);
        this.forge = new JButton("Forge (1,000 gps)");
        this.forge.setBounds(220, 140, 150, 20);
        this.forge.addActionListener(new forge(this, null));
        this.add(this.forge);
        this.sell_forge = new JButton("Sell");
        this.sell_forge.setBounds(120, 140, 100, 20);
        this.sell_forge.addActionListener(new sell_Forge(this, null));
        this.add(this.sell_forge);
        this.god = new JButton("God (100,000 gps)");
        this.god.setBounds(220, 160, 150, 20);
        this.god.addActionListener(new God(this, null));
        this.add(this.god);
        this.sell_god = new JButton("Sell");
        this.sell_god.setBounds(120, 160, 100, 20);
        this.sell_god.addActionListener(new sell_God(this, null));
        this.add(this.sell_god);
    }

    public void play() {
        while (this.gold_collected < 999999999) {
            this.gold_collected += this.tps;
            this.gold.setText("Gold: " + this.gold_collected);
            this.update();
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void update() {
        if (this.gold_collected >= this.clickerprice) {
            this.clicker.setBackground(Color.white);
        } else {
            this.clicker.setBackground(Color.black);
        }
        if (this.clickers >= 1) {
            this.sell_clicker.setBackground(Color.white);
        } else {
            this.sell_clicker.setBackground(Color.black);
        }
        if (this.mines >= 1) {
            this.sell_mine.setBackground(Color.white);
        } else {
            this.sell_mine.setBackground(Color.black);
        }
        if (this.jewelers >= 1) {
            this.sell_jeweler.setBackground(Color.white);
        } else {
            this.sell_jeweler.setBackground(Color.black);
        }
        if (this.pirates >= 1) {
            this.sell_pirate.setBackground(Color.white);
        } else {
            this.sell_pirate.setBackground(Color.black);
        }
        if (this.merchants >= 1) {
            this.sell_merchant.setBackground(Color.white);
        } else {
            this.sell_merchant.setBackground(Color.black);
        }
        if (this.forges >= 1) {
            this.sell_forge.setBackground(Color.white);
        } else {
            this.sell_forge.setBackground(Color.black);
        }
        if (this.gods >= 1) {
            this.sell_god.setBackground(Color.white);
        } else {
            this.sell_god.setBackground(Color.black);
        }
        if (this.gold_collected >= this.mineprice) {
            this.mine.setBackground(Color.white);
        } else {
            this.mine.setBackground(Color.black);
        }
        if (this.gold_collected >= this.jewelerprice) {
            this.jeweler.setBackground(Color.white);
        } else {
            this.jeweler.setBackground(Color.black);
        }
        if (this.gold_collected >= this.pirateprice) {
            this.pirate.setBackground(Color.white);
        } else {
            this.pirate.setBackground(Color.black);
        }
        if (this.gold_collected >= this.merchantprice) {
            this.merchant.setBackground(Color.white);
        } else {
            this.merchant.setBackground(Color.black);
        }
        if (this.gold_collected >= this.forgeprice) {
            this.forge.setBackground(Color.white);
        } else {
            this.forge.setBackground(Color.black);
        }
        if (this.gold_collected >= this.godprice) {
            this.god.setBackground(Color.white);
        } else {
            this.god.setBackground(Color.black);
        }
    }

    public static void main(String[] args) {
        gold_collector frame = new gold_collector("Matt's Gold Collector V_0.1.4");
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.play();
    }

    static /* synthetic */ void access$1(gold_collector gold_collector2, int n) {
        gold_collector2.gold_collected = n;
    }

    static /* synthetic */ void access$5(gold_collector gold_collector2, int n) {
        gold_collector2.clickers = n;
    }

    static /* synthetic */ void access$6(gold_collector gold_collector2, int n) {
        gold_collector2.clickerprice = n;
    }

    static /* synthetic */ void access$10(gold_collector gold_collector2, int n) {
        gold_collector2.tps = n;
    }

    static /* synthetic */ void access$14(gold_collector gold_collector2, int n) {
        gold_collector2.mines = n;
    }

    static /* synthetic */ void access$15(gold_collector gold_collector2, int n) {
        gold_collector2.mineprice = n;
    }

    static /* synthetic */ void access$20(gold_collector gold_collector2, int n) {
        gold_collector2.jewelers = n;
    }

    static /* synthetic */ void access$21(gold_collector gold_collector2, int n) {
        gold_collector2.jewelerprice = n;
    }

    static /* synthetic */ void access$26(gold_collector gold_collector2, int n) {
        gold_collector2.pirates = n;
    }

    static /* synthetic */ void access$27(gold_collector gold_collector2, int n) {
        gold_collector2.pirateprice = n;
    }

    static /* synthetic */ void access$32(gold_collector gold_collector2, int n) {
        gold_collector2.merchants = n;
    }

    static /* synthetic */ void access$33(gold_collector gold_collector2, int n) {
        gold_collector2.merchantprice = n;
    }

    static /* synthetic */ void access$38(gold_collector gold_collector2, int n) {
        gold_collector2.forges = n;
    }

    static /* synthetic */ void access$39(gold_collector gold_collector2, int n) {
        gold_collector2.forgeprice = n;
    }

    static /* synthetic */ void access$44(gold_collector gold_collector2, int n) {
        gold_collector2.gods = n;
    }

    static /* synthetic */ void access$45(gold_collector gold_collector2, int n) {
        gold_collector2.godprice = n;
    }

    private class Click
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private Click(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            gold_collector gold_collector2 = this.this$0;
            gold_collector.access$1(gold_collector2, gold_collector2.gold_collected + 1);
            this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
            this.this$0.update();
        }

        /* synthetic */ Click(gold_collector gold_collector2, Click click) {
            Click click2;
            click2(gold_collector2);
        }
    }

    private class Clicker
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private Clicker(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.gold_collected >= this.this$0.clickerprice) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$5(gold_collector2, gold_collector2.clickers + 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected - this.this$0.clickerprice);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$6(gold_collector4, (int)((double)gold_collector4.clickerprice * 1.25));
                this.this$0.clickerstats.setText(String.valueOf(this.this$0.clickerprice));
                this.this$0.clickerstats_1.setText(String.valueOf(this.this$0.clickers));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps + 1);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ Clicker(gold_collector gold_collector2, Clicker clicker) {
            Clicker clicker2;
            clicker2(gold_collector2);
        }
    }

    private class God
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private God(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.gold_collected >= this.this$0.godprice) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$44(gold_collector2, gold_collector2.gods + 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected - this.this$0.godprice);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$45(gold_collector4, (int)((double)gold_collector4.godprice * 1.25));
                this.this$0.godstats.setText(String.valueOf(this.this$0.godprice));
                this.this$0.godstats_1.setText(String.valueOf(this.this$0.gods));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps + 100000);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ God(gold_collector gold_collector2, God god) {
            God god2;
            god2(gold_collector2);
        }
    }

    private class Mine
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private Mine(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.gold_collected >= this.this$0.mineprice) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$14(gold_collector2, gold_collector2.mines + 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected - this.this$0.mineprice);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$15(gold_collector4, (int)((double)gold_collector4.mineprice * 1.25));
                this.this$0.minestats.setText(String.valueOf(this.this$0.mineprice));
                this.this$0.minestats_1.setText(String.valueOf(this.this$0.mines));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps + 5);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ Mine(gold_collector gold_collector2, Mine mine) {
            Mine mine2;
            mine2(gold_collector2);
        }
    }

    private class Pirate
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private Pirate(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.gold_collected >= this.this$0.pirateprice) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$26(gold_collector2, gold_collector2.pirates + 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected - this.this$0.pirateprice);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$27(gold_collector4, (int)((double)gold_collector4.pirateprice * 1.25));
                this.this$0.piratestats.setText(String.valueOf(this.this$0.pirateprice));
                this.this$0.piratestats_1.setText(String.valueOf(this.this$0.pirates));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps + 50);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ Pirate(gold_collector gold_collector2, Pirate pirate) {
            Pirate pirate2;
            pirate2(gold_collector2);
        }
    }

    private class forge
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private forge(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.gold_collected >= this.this$0.forgeprice) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$38(gold_collector2, gold_collector2.forges + 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected - this.this$0.forgeprice);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$39(gold_collector4, (int)((double)gold_collector4.forgeprice * 1.25));
                this.this$0.forgestats.setText(String.valueOf(this.this$0.forgeprice));
                this.this$0.forgestats_1.setText(String.valueOf(this.this$0.forges));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps + 1000);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ forge(gold_collector gold_collector2, forge forge2) {
            forge forge3;
            forge3(gold_collector2);
        }
    }

    private class jeweler
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private jeweler(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.gold_collected >= this.this$0.jewelerprice) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$20(gold_collector2, gold_collector2.jewelers + 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected - this.this$0.jewelerprice);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$21(gold_collector4, (int)((double)gold_collector4.jewelerprice * 1.25));
                this.this$0.jewelerstats.setText(String.valueOf(this.this$0.jewelerprice));
                this.this$0.jewelerstats_1.setText(String.valueOf(this.this$0.jewelers));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps + 20);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ jeweler(gold_collector gold_collector2, jeweler jeweler2) {
            jeweler jeweler3;
            jeweler3(gold_collector2);
        }
    }

    private class merchant
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private merchant(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.gold_collected >= this.this$0.merchantprice) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$32(gold_collector2, gold_collector2.merchants + 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected - this.this$0.merchantprice);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$33(gold_collector4, (int)((double)gold_collector4.merchantprice * 1.25));
                this.this$0.merchantstats.setText(String.valueOf(this.this$0.merchantprice));
                this.this$0.merchantstats_1.setText(String.valueOf(this.this$0.merchants));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps + 100);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ merchant(gold_collector gold_collector2, merchant merchant2) {
            merchant merchant3;
            merchant3(gold_collector2);
        }
    }

    private class sell_Clicker
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private sell_Clicker(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.clickers >= 1) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$5(gold_collector2, gold_collector2.clickers - 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected + this.this$0.clickerprice / 2);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$6(gold_collector4, (int)((double)gold_collector4.clickerprice / 1.25));
                this.this$0.clickerstats.setText(String.valueOf(this.this$0.clickerprice));
                this.this$0.clickerstats_1.setText(String.valueOf(this.this$0.clickers));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps - 1);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ sell_Clicker(gold_collector gold_collector2, sell_Clicker sell_Clicker2) {
            sell_Clicker sell_Clicker3;
            sell_Clicker3(gold_collector2);
        }
    }

    private class sell_Forge
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private sell_Forge(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.forges >= 1) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$38(gold_collector2, gold_collector2.forges - 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected + this.this$0.forgeprice / 2);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$39(gold_collector4, (int)((double)gold_collector4.forgeprice / 1.25));
                this.this$0.forgestats.setText(String.valueOf(this.this$0.forgeprice));
                this.this$0.forgestats_1.setText(String.valueOf(this.this$0.forges));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps - 1000);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ sell_Forge(gold_collector gold_collector2, sell_Forge sell_Forge2) {
            sell_Forge sell_Forge3;
            sell_Forge3(gold_collector2);
        }
    }

    private class sell_God
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private sell_God(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.gods >= 1) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$44(gold_collector2, gold_collector2.gods - 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected + this.this$0.godprice / 2);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$45(gold_collector4, (int)((double)gold_collector4.godprice / 1.25));
                this.this$0.godstats.setText(String.valueOf(this.this$0.godprice));
                this.this$0.godstats_1.setText(String.valueOf(this.this$0.gods));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps - 100000);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ sell_God(gold_collector gold_collector2, sell_God sell_God2) {
            sell_God sell_God3;
            sell_God3(gold_collector2);
        }
    }

    private class sell_Mine
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private sell_Mine(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.mines >= 1) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$14(gold_collector2, gold_collector2.mines - 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected + this.this$0.mineprice / 2);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$15(gold_collector4, (int)((double)gold_collector4.mineprice / 1.25));
                this.this$0.minestats.setText(String.valueOf(this.this$0.mineprice));
                this.this$0.minestats_1.setText(String.valueOf(this.this$0.mines));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps - 5);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ sell_Mine(gold_collector gold_collector2, sell_Mine sell_Mine2) {
            sell_Mine sell_Mine3;
            sell_Mine3(gold_collector2);
        }
    }

    private class sell_Pirate
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private sell_Pirate(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.pirates >= 1) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$26(gold_collector2, gold_collector2.pirates - 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected + this.this$0.pirateprice / 2);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$27(gold_collector4, (int)((double)gold_collector4.pirateprice / 1.25));
                this.this$0.piratestats.setText(String.valueOf(this.this$0.pirateprice));
                this.this$0.piratestats_1.setText(String.valueOf(this.this$0.pirates));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps - 50);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ sell_Pirate(gold_collector gold_collector2, sell_Pirate sell_Pirate2) {
            sell_Pirate sell_Pirate3;
            sell_Pirate3(gold_collector2);
        }
    }

    private class sell_jeweler
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private sell_jeweler(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.jewelers >= 1) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$20(gold_collector2, gold_collector2.jewelers - 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected + this.this$0.jewelerprice / 2);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$21(gold_collector4, (int)((double)gold_collector4.jewelerprice / 1.25));
                this.this$0.jewelerstats.setText(String.valueOf(this.this$0.jewelerprice));
                this.this$0.jewelerstats_1.setText(String.valueOf(this.this$0.jewelers));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps - 20);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ sell_jeweler(gold_collector gold_collector2, sell_jeweler sell_jeweler2) {
            sell_jeweler sell_jeweler3;
            sell_jeweler3(gold_collector2);
        }
    }

    private class sell_merchant
    implements ActionListener {
        final /* synthetic */ gold_collector this$0;

        private sell_merchant(gold_collector gold_collector2) {
            this.this$0 = gold_collector2;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (this.this$0.merchants >= 1) {
                gold_collector gold_collector2 = this.this$0;
                gold_collector.access$32(gold_collector2, gold_collector2.merchants - 1);
                gold_collector gold_collector3 = this.this$0;
                gold_collector.access$1(gold_collector3, gold_collector3.gold_collected + this.this$0.merchantprice / 2);
                gold_collector gold_collector4 = this.this$0;
                gold_collector.access$33(gold_collector4, (int)((double)gold_collector4.merchantprice / 1.25));
                this.this$0.merchantstats.setText(String.valueOf(this.this$0.merchantprice));
                this.this$0.merchantstats_1.setText(String.valueOf(this.this$0.merchants));
                gold_collector gold_collector5 = this.this$0;
                gold_collector.access$10(gold_collector5, gold_collector5.tps - 100);
                this.this$0.gold.setText("Gold: " + this.this$0.gold_collected);
                this.this$0.GPS.setText("Gold per second: " + this.this$0.tps);
                this.this$0.update();
            }
        }

        /* synthetic */ sell_merchant(gold_collector gold_collector2, sell_merchant sell_merchant2) {
            sell_merchant sell_merchant3;
            sell_merchant3(gold_collector2);
        }
    }

}
