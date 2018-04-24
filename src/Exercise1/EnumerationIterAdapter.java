package Exercise1;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterAdapter<T>  implements Iterator<T> {
    private Enumeration<T> en;

    public EnumerationIterAdapter(Enumeration<T> en) {
        this.en = en;
    }

    @Override
    public boolean hasNext() {
        return en.hasMoreElements();
    }

    @Override
    public T next() {
        return en.nextElement();
    }
}
