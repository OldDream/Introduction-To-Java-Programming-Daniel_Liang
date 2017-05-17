import java.util.PriorityQueue;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable{
    @Override
    public MyPriorityQueue<E> clone() throws CloneNotSupportedException {
        MyPriorityQueue<E> clone = new MyPriorityQueue<>();

        for (E a : this) {    //这是浅复制，里面的引用和原来是一样的。
            clone.add(a);
        }

        return clone;
    }
}