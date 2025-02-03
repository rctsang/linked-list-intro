import java.util.Random;

public class IntLinkedList {

	private class IntNode {
		public int value;
		public IntNode next;

		public IntNode(int value, IntNode next) {
			this.value = value;
			this.next = next;
		}
	}

	// a reference to the first node in the list
	private IntNode first;

	public IntLinkedList() {
		first = null;
	}

	public void print() {
		IntNode p = first;
		while (p != null) {
			if (p.next == null) {
				System.out.println(p.value);
			} else {
				System.out.print(p.value + " -> ");
			}
			p = p.next;
		}
	}

	// helper to throw an index OOB exception
	private static void iob(int index) throws IndexOutOfBoundsException {
		throw new IndexOutOfBoundsException("index out of bounds: " + index);
	}

	public int size() {

		// YOUR CODE HERE

	}

	public int get(int pos) throws IndexOutOfBoundsException {

		// YOUR CODE HERE

	}

	public void update(int pos, int value) throws IndexOutOfBoundsException {

		// YOUR CODE HERE

	}

	public void insert(int pos, int value) throws IndexOutOfBoundsException {

		// YOUR CODE HERE

	}

	public void remove(int pos) throws IndexOutOfBoundsException {

		// YOUR CODE HERE

	}


	public static void main(String[] args) {
		long seed = 42L;
		Random rand = new Random(seed);

		IntLinkedList list = new IntLinkedList();

		// insert between 10 and 30 random values between 0 and 20
		int length = 10 + rand.nextInt(20);
		for (int i = 0; i < length; i++) {
			try {
				list.insert(0, rand.nextInt(20));
				list.print();
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
				return;
			}
		}

		for (int i = 0; i < length; i++) {
			try {
				list.update(i, i);
				list.print();
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
				return;
			}
		}

		while (list.size() > 0) {
			try {
				list.remove(0);
				list.print();
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
				return;
			}
		}
	}
}