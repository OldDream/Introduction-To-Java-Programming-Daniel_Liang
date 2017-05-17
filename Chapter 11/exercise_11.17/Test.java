import java.util.*;

public class Test {
	public static void main(String[] args) {
		int result = 1;
		System.out.print("Enter a plus integer: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		ShowPrimeFactor s1 = new ShowPrimeFactor(num);
		ArrayList<Integer> factor = s1.ShowPrimeFactor();
		ArrayList<MyPoint> list = new ArrayList<>();
		int size = factor.size();
		for (int i = 0; i < size; ) {    //把（因子，出现次数）用MyPoint格式放入ArrayList中。
				int y = 1;
				int x = factor.get(0);
				factor.remove(0);
				size--;
			for (int j = 0; j < size; j++) {
				if (x == factor.get(j)) {
					y++;
					factor.remove(j);
					j--;
					size--;
				}
			}
			list.add(new MyPoint(x, y));
		}

//		System.out.println(list);	//测试list
		//检查并求出现次数为奇数次的因子的积。
		for (int i = 0; i < list.size(); i++) {
			if (isOddNum.isOdd((int)list.get(i).getY()))
				result *= list.get(i).getX();
		}

		System.out.println("The smallest number n for m * n to be a perfect square is : " + result);
		System.out.println("m * n = " + result * num);
	}
}