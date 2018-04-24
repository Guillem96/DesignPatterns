package Exercise1;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenizerAdapterObj implements Iterator<Object> {

    private final StringTokenizer st;

    public StringTokenizerAdapterObj(String str, String sep) {
        this.st = new StringTokenizer(str, sep);
    }


    @Override
    public boolean hasNext() {
        return st.hasMoreElements();
    }

    @Override
    public Object next() {
        return st.nextElement();
    }
}
