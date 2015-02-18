package lab_3.part_1;

import java.awt.*;
import java.awt.event.*;

//illustrates use of Abstract Factory pattern
public class Gardener extends Frame implements ActionListener {

    private Checkbox Veggie, Annual, Peren, Tree;
    private Button Center, Border, Shade, Quit;
    private Garden garden = null;
    private GardenPanel gardenPlot;
    private String borderPlant = "", centerPlant = "", shadePlant = "";

    public Gardener() {
        super("Garden planner");
        setGUI();
    }
    //----------------------------------
    private void setGUI() {
        setBackground(Color.lightGray);
        setLayout(new GridLayout(1,2)); // 1 row 2 columns
        Panel left = new Panel();
        add(left);
        Panel right= new Panel();
        add(right);

        //create label and 3 radio buttons on left side

        left.setLayout(new GridLayout(5, 1)); // 4 rows and 1 column
        left.add(new Label("Garden type"));
        CheckboxGroup grp= new CheckboxGroup();
        Veggie = new Checkbox("Vegetable", grp, false);
        Annual = new Checkbox("Annual", grp, false);
        Peren = new Checkbox("Perennial", grp, false);
        Tree = new Checkbox("Tree", grp, false);

        left.add(Veggie);
        left.add(Annual);
        left.add(Peren);
        left.add(Tree);

        Veggie.addItemListener(new VeggieListener());
        Peren.addItemListener(new PerenListener());
        Annual.addItemListener(new AnnualListener());
        Tree.addItemListener(new TreeListener());



        //now create right side
        right.setLayout(new GridLayout(2,1)); // 2 rows 1 column
        gardenPlot = new GardenPanel(); // defined below
        gardenPlot.setBackground(Color.white);
        Panel botRight = new Panel();

        right.add(gardenPlot);
        right.add(botRight);
        Center = new Button("Central");
        Border =  new Button("Border");
        Shade = new Button("Shade");
        Quit = new Button("Quit");
        // add buttons to panel
        botRight.add(Center);
        Center.addActionListener(this);
        botRight.add(Border);
        Border.addActionListener(this);
        botRight.add(Shade);
        Shade.addActionListener(this);
        botRight.add(Quit);
        Quit.addActionListener(this);
        setBounds(200,200, 400,300);
        setVisible(true);

    }

    //----------------------------------
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == Center)
            setCenter();
        if (obj == Border)
            setBorder();
        if (obj == Shade)
            setShade();
        if (obj == Quit)
            System.exit(0);
    }
    //----------------------------------
    private void setCenter() {
        if (garden != null) centerPlant = garden.getCenter().getName();
        // repaints garden panel
        gardenPlot.repaint();
    }
    private void setBorder() {
        if (garden != null) borderPlant = garden.getBorder().getName();
        gardenPlot.repaint();
    }
    private void setShade() {
        if (garden != null) shadePlant = garden.getShade().getName();
        gardenPlot.repaint();
    }
    private void clearPlants() {
        shadePlant=""; centerPlant=""; borderPlant = "";
        gardenPlot.repaint();
    }
    //----------------------------------
    static public void main(String argv[]) {
        new Gardener();
    }
//--------------------------------
    class GardenPanel extends Panel {
        public void paint (Graphics g) {
            Dimension sz=getSize();
            g.setColor(Color.lightGray);
            g.fillArc( 0, 0, 80, 80,0, 360);
            g.setColor(Color.black);
            g.drawRect(0,0, sz.width-1, sz.height-1);
            g.drawString(centerPlant, 100, 50);
            g.drawString( borderPlant, 75, 120);
            g.drawString(shadePlant, 10, 40);
        }
    }
    //-----------------------------
    class VeggieListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
			// creating an instance of garden as VeggieGarden
            garden = new VeggieGarden();
            clearPlants();
        }
    }
    //-----------------------------
    class PerenListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
			// creating an instance of garden as PerennialGarden
            garden = new PerennialGarden();
            clearPlants();
        }
    }
    //-----------------------------
    class AnnualListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            garden = new AnnualGarden();
            clearPlants();
        }
    }

    /**
     * Listener for change on Tree garden checkbox
     */
    class TreeListener implements ItemListener {

        /**
         * Invoked when an item has been selected or deselected by the user.
         * The code written for this method performs the operations
         * that need to occur when an item is selected (or deselected).
         *
         * @param e passed by event dispatch thread
         */
        @Override
        public void itemStateChanged(ItemEvent e) {
            garden = new TreeGarden();
            clearPlants();
        }
    }
}

