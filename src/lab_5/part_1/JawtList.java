package lab_5.part_1;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Created by lecturer.
 */
class JawtList extends JScrollPane implements ListSelectionListener, AwtList {

    private JList<String> listWindow;
    private JListData<String> listContents;

    JawtList() {
        listContents = new JListData<>();
        listWindow = new JList<>(listContents);
        listWindow.setPrototypeCellValue("Abcdefg Hijkmnop");
        getViewport().add(listWindow);
    }

    void addListSelectionListener(ListSelectionListener itl)   {
        listWindow.addListSelectionListener(itl);
    }

    int getSelectedIndex()  {
        return listWindow.getSelectedIndex();
    }

    void setMultipleMode(boolean mode) {

        if (mode)
           listWindow.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        else
            listWindow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    int getItemCount() {
        return listContents.getSize ();
    }

    void setSelectedIndex(int i) {

        listWindow.setSelectedIndex(i);
        listWindow.ensureIndexIsVisible(i);
    }

    void deselect(int i) {
        listWindow.clearSelection();
    }

    @Override
    public void add(String s) {
        listContents.addElement(s);
    }

    @Override
    public void remove(String s) {
        listContents.removeElement(s);
    }

    @Override
    public String[] getSelectedItems() {

        Object[] obj = listWindow.getSelectedValues();
        String[] s = new String[obj.length];
        for (int i = 0; i < obj.length; i++)
            s[i] = obj[i].toString();
        return s;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {}

}

/**
 * Created by lecturer, slightly refactored by Martin Zuber.
 */
class JListData<String> extends AbstractListModel {

    Vector<String> data;

    JListData() {

        data = new Vector<>();
    }

    void addElement(String s) {

        data.addElement(s);
        fireIntervalAdded(this, data.size() - 1, data.size());
    }

    void removeElement(String s) {

        data.removeElement(s);
        fireIntervalRemoved(this, 0, data.size());
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Object getElementAt(int index) {
        return data.elementAt(index);
    }

}

