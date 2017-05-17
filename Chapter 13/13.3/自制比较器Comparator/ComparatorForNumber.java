import java.util.Comparator;

public class ComparatorForNumber implements Comparator {
    public int compare(Object x1, Object x2) {
        Number o1 = (Number)x1;
        Number o2 = (Number)x2;
        if (o1.doubleValue() < o2.doubleValue())
            return -1;
        else if (o1.doubleValue() > o2.doubleValue())
            return 1;
        else
            return 0;
    }
} 