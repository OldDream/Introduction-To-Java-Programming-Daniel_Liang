public class Queue {
	private int[] element;
	private int size, index;

	public Queue() {
		this.size = 8;
		element = new int[size];
	}

	public void enqueue(int v) {
			if (index == size) {
				int[] temp = new int[size * 2];
			System.arraycopy(element, 0, temp, 0, size);
			this.element = temp;
			size *= 2;
			}

			element[index++] = v;
	}

	public int dequeue() {
		int temp = element[0];
		for (int i = 0; i < index; i++)
			element[i] = element[i + 1];
		index--;
		return temp;
	}

	public boolean empty() {
		if (index == 0)
			return true;
		else
			return false;
	}

	public int getSize() {
		return size;
	}
}