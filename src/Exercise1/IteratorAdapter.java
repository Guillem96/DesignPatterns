package Exercise1;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter<E> implements Enumeration {

    private Iterator<E> iter;

    public IteratorAdapter(Iterator it) {
        iter = it;
    }

    @Override
    public boolean hasMoreElements() {
        return iter.hasNext();
    }

    @Override
    public Object nextElement() {
        return iter.next();
    }
}
