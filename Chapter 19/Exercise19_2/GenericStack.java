import java.util.ArrayList;
import java.util.Scanner;

public class GenericStack<E> extends ArrayList<E> {
    //实际上ArrayList也是用无参构造方法的，所以就不用在这里修改构造方法了。

    public int getSize() {
        return super.size();
    }

    public E peek() {
        return super.get(getSize()  - 1);
    }

    public E pop() {
        int index = getSize() - 1;
        E o = super.get(index);
        super.remove(index);
        return o;
    }

    public void push(E o) {
        super.add(o);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public String toString() {
        return "Stack: " + super.toString();
    }
}