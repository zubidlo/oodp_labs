package lab_8.part_2;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * Created by martin on 14/04/2015.
 */
public class OilPriceIndicator extends JFrame implements Subject{

    private Vector<Observer> observers;
    private double price = 1;
    private JLabel priceLabel;

    public OilPriceIndicator(String title) {

        super(title);
        observers = new Vector<>();
        priceLabel = new JLabel(String.format("Price: %.2f \u20Ac", price));
        getContentPane().setBackground(Color.white);
        getContentPane().add(priceLabel, BorderLayout.CENTER);
        setSize(200, 80);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public synchronized void registerInterest(Observer observer) {
        observers.add(observer);
    }

    public static void main(String[] args) {
        OilPriceIndicator opi = new OilPriceIndicator("Subject");
        BritishOilPrice bop = new BritishOilPrice("Observer 1");
        JapanOilPrice jop = new JapanOilPrice("Observer 2");
        opi.registerInterest(bop);
        opi.registerInterest(jop);
        SwingUtilities.invokeLater(bop);
        SwingUtilities.invokeLater(jop);

        while (true) {
            opi.updatePrice();
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updatePrice() {
        price += Math.random();
        priceLabel.setText(String.format("Price: %.2f \u20AC", price));
        observers.forEach(o -> o.sendNotify(price));
    }
}
