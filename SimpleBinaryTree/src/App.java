
public class App {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		
		System.out.println("Is tree empty "+bt.isEmpty());
		
		bt.insert(23);
		bt.insert(43);
		bt.insert(3);
		bt.insert(12);
		bt.insert(35);
		bt.insert(21);
		bt.insert(17);
		

		System.out.println("Is tree empty"+bt.isEmpty());
		
		bt.preorder();
		System.out.println();
		bt.inorder();
		System.out.println();
		bt.posorder();
		System.out.println();
		
		System.out.println("Node count: "+bt.nodeCount());
		System.out.println("Height: "+bt.getHeight());
		
		bt.remove(3);
		
		bt.inorder();
		
	}

}
