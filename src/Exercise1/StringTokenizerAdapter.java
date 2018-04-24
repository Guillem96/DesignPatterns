package Exercise1;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenizerAdapter extends StringTokenizer implements Iterator {
    public StringTokenizerAdapter(String s, String s1, boolean b) {
        super(s, s1, b);
    }

    public StringTokenizerAdapter(String s, String s1) {
        super(s, s1);
    }

    public StringTokenizerAdapter(String s) {
        super(s);
    }


    @Override
    public boolean hasNext() {
        // hasMoreTokens is the same but hasMoreElements
        // is the function that Enumeration interface defines
        return super.hasMoreElements();
    }

    @Override
    public Object next() {
        // Same as nextToken
        return super.nextElement();
    }
}
