public class TestMyStack {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		stack.push("DDD");
		stack.push("EEE");

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}