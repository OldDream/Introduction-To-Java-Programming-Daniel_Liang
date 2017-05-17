public class Exercise19_11 {
    public static void main(String[] args) {
        Complex[][] m1 = createMatrix(3);
        Complex[][] m2 = createMatrix(3);


        ComplexMatrix matrix = new ComplexMatrix();
        ComplexMatrix.printResult(m1, m2, matrix.addMatrix(m1, m2), '+');
    }

    public static Complex[][] createMatrix(int size) {
        Complex[][] m1 = new Complex[size][size];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {

                m1[i][j] = new Complex((int)(Math.random() * 10), (int)(Math.random() * 10));
            }
        }

        return m1;
    }

}