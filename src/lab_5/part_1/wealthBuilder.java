package lab_5.part_1;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Created by lecturer, refactored by Martin Zuber.
 */
class WealthBuilder extends JFrame
        implements ListSelectionListener, ActionListener {

    private static final Vector<String> BONDS = new Vector<String>(
            Arrays.asList("CT State GO 2012", "New York GO 2005",
                    "GE Corp BONDS"));

    private static final Vector<String> STOCKS = new Vector<String>(
            Arrays.asList("Cisco", "Coca Cola", "General Electric",
                    "Harley Davidson", "IBM", "Harley Davidson"));

    private static final Vector<String> MUTUALS = new Vector<String>(
            Arrays.asList("Fidelity Magellan", "T Rowe Price",
                    "Vanguard PrimeCap", "Lindner Fund"));

    private static final Vector<String> JAPAN_STOCK = new Vector<String>(
            Arrays.asList("Toshiba", "Sony", "Toyota", "Honda", "Technics"));

    private final JawtList stockList;
    private final JButton plot;
    private final JPanel choicePanel;
    private final ChoiceFactory choiceFactory;
    private MultiChoice multiChoice;

    WealthBuilder() {

        super("Wealth Builder");

        stockList = new JawtList();
        plot = new JButton("plot");
        choicePanel = new JPanel();
        choiceFactory = new ChoiceFactory();

        JPanel centerPanel = new JPanel();
        getContentPane().add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new GridLayout(1, 2));

        stockList.add("Stocks");
        stockList.add("Bonds");
        stockList.add("Mutual Funds");
        stockList.add("Japan Stock");
        centerPanel.add(stockList);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.lightGray);
        southPanel.add(plot);
        getContentPane().add(southPanel, BorderLayout.SOUTH);

        choicePanel.setBackground(Color.lightGray);
        centerPanel.add(choicePanel);

        setBounds(100, 100, 300, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        stockList.addListSelectionListener(this);
        plot.addActionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

        Vector<String> vector;
        String selectedItem = stockList.getSelectedItems()[0];

        if (selectedItem.equals("Stocks")) vector = STOCKS;
        else if (selectedItem.equals("Bonds")) vector = BONDS;
        else if (selectedItem.equals("Mutual Funds"))vector = MUTUALS;
        else vector = JAPAN_STOCK;

        multiChoice = choiceFactory.getChoiceUI(vector);

        choicePanel.removeAll();
        choicePanel.add(multiChoice.getUI());
        choicePanel.validate();
        choicePanel.repaint();
        plot.setEnabled(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {

        PlotDialog pl = new PlotDialog(this, multiChoice);
        pl.setVisible(true);
    }

    static public void main(String[] argv) {
        new WealthBuilder();
    }
}        

