package lab_2.part_1;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Created by martin on 12/02/2015.
 */
public class ListView extends AbstractHobbyView {

    private final JList<Hobby> list;

    /**
     * Creates JFrame with given title and hobbies to list.
     * @param title  title of the frame
     * @param hobbies vector of hobbies
     */
    public ListView(String title, Vector<Hobby> hobbies) {

        super(title);

        //create specific components
        list = new JList<Hobby>(hobbies);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScroll = new JScrollPane(list);
        listScroll.setPreferredSize(new Dimension(200, 300));
        canvas.add(listScroll, BorderLayout.NORTH);
        pack();
    }

    /**
     * Puts hobbies in list.
     * @param hobbies hobbies to refill list with.
     */
    public void refillViewList(Vector<Hobby> hobbies) { list.setListData(hobbies); }
}
