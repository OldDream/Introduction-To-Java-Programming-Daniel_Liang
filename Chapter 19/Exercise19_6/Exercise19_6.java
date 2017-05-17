public class Exercise19_6 {
    public static void main(String[] args) {
        Integer[][] list = {{1,2,3}, {4,5,6}, {7,8,9,10}};
        System.out.println("Max is " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list) {
        E tempMax = list[0][0];
        for (int i = 1; i < list.length; i++) {
            for (int j = 1; j < list[i].length; j++) {
                if (list[i][j].compareTo(tempMax) > 0)
                    tempMax = list[i][j];
            }
        }
        return tempMax;
    }
}