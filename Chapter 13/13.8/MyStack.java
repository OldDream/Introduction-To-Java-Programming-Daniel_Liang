import java.util.*;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }

    @Override
    public Object clone() {
        MyStack ms = null;
        try {
            ms = (MyStack)super.clone();
            ms.list = new ArrayList<>(list);
        }
        catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return ms;
    }
}