package lab_8.part_1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;

/**
 * Iterator implementation
 * Created by martin on 16/04/2015.
 */
public class MyIterator<T> implements Iterator<T> {

    private final List<T> things;
    private int index;

    public MyIterator(final Vector<T> things) {
        this.things = things;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return things.size() != index;
    }

    @Override
    public T next() {
        if(hasNext()) return things.get(index++);
        else throw new NoSuchElementException("no more elements");
    }
}
