import java.util.Random;

public class Box {
	public int value;
	public Box next;

	public Box(int val, Box nxt) {
		value = val;
		next = nxt;
	}

	public void print() {
		if (next == null) {
			System.out.println(value);
		} else {
			System.out.print(value + " -> ");
			next.print();
		}
	}

	public static void main(String[] args) {
		long seed = 42L;
		Random rand = new Random(seed);

		// create the above list using boxes
		Box list = null;

		for (int i = 0; i < 10; i++) {
			list = new Box(rand.nextInt(20), list);
		}

		System.out.println("the list:");
		list.print();

		// Exercises:

		Box p;
		int i;
		
		System.out.println("TODO: get the size of the list");

		int size = 0;


		// YOUR CODE HERE


		System.out.println(size);

		System.out.println("TODO: get the value at position 7");

		int val = 0;


		// YOUR CODE HERE


		System.out.println(val);

		System.out.println("TODO: update the value at position 5 with 12");


		// YOUR CODE HERE


		list.print();

		System.out.println("TODO: insert the value -1 at position 7");


		// YOUR CODE HERE


		list.print();

		System.out.println("TODO: insert the value 0 at position 0");


		// YOUR CODE HERE


		list.print();

		System.out.println("TODO: remove the value at position 6");


		// YOUR CODE HERE


		list.print();

		System.out.println("TODO: remove the value at position 0");


		// YOUR CODE HERE


		list.print();
	}
}
