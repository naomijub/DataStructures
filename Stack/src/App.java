
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		
		stack.push("Ellen Page");
		stack.push("Jesus Batatista");
		stack.push("Jaime Clayton");
		stack.push("Laverne Cox");
		
		stack.lookTop();
		
		stack.printNod(stack.pull());
		System.out.println();
		
		stack.push("Laverne Cox");
		
		stack.popAll();
		
	}

}
