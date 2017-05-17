import java.util.*;

public class ShowPrimeFactor {
	private int num;
	private ArrayList<Integer> stk1 = new ArrayList<>();
	private StackOfIntegers stk = new StackOfIntegers();

	public ShowPrimeFactor(int num) {
		this.num = num;
	}

	public ArrayList<Integer> ShowPrimeFactor() {
		FindPrimeFactor(num, stk);

		while(!stk.isEmpty())
			stk1.add(stk.pop());

		return stk1;
	}

	public void FindPrimeFactor(int num, StackOfIntegers stk) {
		for (int i = num; i >=1; i--) {
			if (num % i == 0 && isPrime(i)) {
				if (i != 1) {
					stk.push(i);
					num /= i;
					i = num + 1;
				}
			}
		}
	}

	public  boolean isPrime(int value) {
		if (value == 2)
			return true;
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
}