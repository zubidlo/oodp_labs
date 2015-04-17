package lab_8.part_2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by martin on 14/04/2015.
 */
public class BritishOilPrice extends JFrame implements Runnable, Observer {

    private JLabel priceLabel;

    public BritishOilPrice(String title) {

        super(title);
        priceLabel = new JLabel();
        getContentPane().setBackground(Color.yellow);
        getContentPane().add(priceLabel, BorderLayout.CENTER);
        setSize(200,80);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void run() {
    }

    @Override
    public void sendNotify(double oilPrice) {
        priceLabel.setText(String.format("Price: %.2f \u20ac", oilPrice));
    }
}
