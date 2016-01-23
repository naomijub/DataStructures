
public class App {

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.add("One");
		queue.add("two");
		queue.add("three");
		queue.add("Four");
		queue.peek();
		queue.printNod(queue.poll());
		queue.peek();

	}

}
