public class GenericStack<E> {
    private int capacity = 100, index = 0;
    private E[] array = (E[]) new Object[capacity];
    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

    public int getSize() {
        return index;
    }

    public E peek() {
        return array[index];
    }

    public void push(E o) {
        if(index < capacity) {
            array[index] = o;
        }
        else {
            capacity *= 2;
            E[] array_temp = (E[]) new Object[capacity];
            for (int i = 0; i < index; i++) {
                array_temp[i] = array[i];
            }
            array = array_temp;
            array[index] = o;
        }
    }

    public E pop() {
        return array[index--];
    }

    public boolean isEmpty() {
        return (index == 0);
    }
}
