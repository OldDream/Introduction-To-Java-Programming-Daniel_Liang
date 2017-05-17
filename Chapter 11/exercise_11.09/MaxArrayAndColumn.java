import java.util.*;

public class MaxArrayAndColumn {
	public static void main(String[] args) {
		System.out.print("Enter the Matrix size n: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}

		for (int i = 0; i < n; i++) {		//打印矩阵
			for (int a : matrix[i])
				System.out.print(a + " ");
			System.out.println();
		}

		int[] column = new int[n];
		int[] array = new int[n];

		for (int i = 0; i < n; i++)		//统计各行1的个数。
			for (int a : matrix[i])
				if(a == 1)
					array[i]++;

		for (int j = 0; j < n; j++)    //统计各列的1数。
			for (int i = 0; i < n; i++)
				if (matrix[i][j] == 1)
					column[j]++;

		ArrayList<Integer> maxIndexColumn = new ArrayList<>();
		ArrayList<Integer> maxIndexArray = new ArrayList<>();

		FindMax(maxIndexArray, array);
		FindMax(maxIndexColumn,column);

		System.out.println("The index of max column is :" + maxIndexColumn);
		System.out.println("The index of max array is :" + maxIndexArray);
	}

	public static void FindMax(ArrayList<Integer> a, int[] b) {
		int max = b[0];
		for (int c : b)
			if (max < c)
				max = c;

		for (int i = 0; i < b.length; i++) {
			if (max == b[i])
				a.add(i);
		}
	}
}