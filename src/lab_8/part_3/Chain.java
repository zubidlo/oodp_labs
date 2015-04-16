package lab_8.part_3;

/**
 * chain interface
 * Created by martin on 14/04/2015.
 */
public interface Chain {

    void addChain(Chain c);
    Chain getChain();
    void sendToChain(Object object);
}
