public class TestQueue {
	public static void main(String[] args) {
		Queue q1 = new Queue();
		int i = 1;
		while (i < 21)
			q1.enqueue(i++);
		while(--i > 0)
			System.out.print(q1.dequeue() + " ");
	}
}