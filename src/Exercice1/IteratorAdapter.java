package Exercice1;

import java.awt.*;
import java.util.ArrayList;
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
