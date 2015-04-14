package lab_8.part_3;

import javax.swing.*;

/**
 * Created by martin on 14/04/2015.
 */
public class Rugby implements Chain {

    private Chain next;

    public Rugby(Chain nextInChain) {
        next = nextInChain;
    }

    @Override
    public void addChain(Chain chain) {
        next = chain;
    }

    @Override
    public Chain getChain() {
        return next;
    }

    @Override
    public void sendToChain(Object object) {
        processObject(object);
        if(next != null) next.sendToChain(object);
    }

    private void processObject(Object object) {
        if(object instanceof ImageIcon) {
            ImageIcon icon = (ImageIcon) object;
            if(icon.getDescription() == "rugby") Part3.rugbyScorePanel.getScoreLabel().setIcon(icon);
            else Part3.rugbyScorePanel.getScoreLabel().setIcon(Part3.icons.get(4));
        }
    }
}