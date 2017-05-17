public class Exercise19_5 {
    public static void main(String[] args) {
        Integer[] list = {1, 2, 3, 4, 5, 6};
        System.out.println("Max is " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E tempMax = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(tempMax) > 0)
                tempMax = list[i];
        }
        return tempMax;
    }
}