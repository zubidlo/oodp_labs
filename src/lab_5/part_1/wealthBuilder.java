package lab_5.part_1;

import utilities.FrameSkeleton;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Created by lecturer, refactored by Martin Zuber.
 */
class WealthBuilder extends FrameSkeleton
        implements ListSelectionListener, ActionListener {

    private static final Vector<String> BONDS = new Vector<>(
            Arrays.asList("CT State GO 2012", "New York GO 2005",
                    "GE Corp BONDS"));

    private static final Vector<String> STOCKS = new Vector<>(
            Arrays.asList("Cisco", "Coca Cola", "General Electric",
                    "Harley Davidson", "IBM", "Harley Davidson"));

    private static final Vector<String> MUTUALS = new Vector<>(
            Arrays.asList("Fidelity Magellan", "T Rowe Price",
                    "Vanguard PrimeCap", "Lindner Fund"));

    private static final Vector<String> JAPAN_STOCK = new Vector<>(
            Arrays.asList("Toshiba", "Sony", "Toyota", "Honda", "Technics"));

    private final JawtList stockList;
    private final JButton plot;
    private final JPanel choicePanel;
    private final ChoiceFactory choiceFactory;
    private MultiChoice multiChoice;

    WealthBuilder(String title) {

        super(title);

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

        switch (selectedItem) {
            case "Stocks":
                vector = STOCKS;
                break;
            case "Bonds":
                vector = BONDS;
                break;
            case "Mutual Funds":
                vector = MUTUALS;
                break;
            default:
                vector = JAPAN_STOCK;
                break;
        }

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

    static public void main(String[] args) {
        new WealthBuilder("Wealth Builder");
    }
}        

