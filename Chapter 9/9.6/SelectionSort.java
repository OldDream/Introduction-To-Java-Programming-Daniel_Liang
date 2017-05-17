public class SelectionSort {
	public static void SelectionSort(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int currentMinNumber = num[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < num.length; j++) {
				if (currentMinNumber > num[j]) {
					currentMinIndex = j;	//保存下标和数值
					currentMinNumber = num[j];
				}
			}
			//进行交换
			if (currentMinIndex != i) {
				num[currentMinIndex] = num[i];
				num[i] = currentMinNumber;
			}
		}
	}
}