import java.util.*;

public class WordOccurrence implements Comparable<WordOccurrence> {
    private String word;
    private int count;

    public WordOccurrence(Map.Entry o) {
        this.word = (String)o.getKey();
        this.count = (Integer)o.getValue();
    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(WordOccurrence o) {
        if (count > o.getCount())
            return 1;
        else if (count > o.getCount())
            return 0;
        else
            return -1;
    }

    public String toString() {
        return word + " " + count;
    }
}