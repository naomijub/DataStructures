
public class BinaryTree {

	//all methods are recursive
	private Node root;
	
	public BinaryTree(){
		root = null;
	}
	
	public BinaryTree(int value){
		root = new Node(value);
	}
	
	//insert
	public void insert(int value){
		if(root == null){
			root = new Node(value);
		}else{
			insert(root, value);
		}
	}
	
	public void insert(Node nod, int value){
		if(value < nod.getValue()){
			if(nod.getLeft() != null){
				insert(nod.getLeft(), value);
			}else{
				Node aux = new Node(value);
				nod.setLeft(aux);
			}
		}else if(value > nod.getValue()){
			if(nod.getRight() != null){
				insert(nod.getRight(), value);
			}else{
				Node aux = new Node(value);
				nod.setRight(aux);
			}
		}
	}
	
	//remove
	public Node remove(int value){
		if(isEmpty()){
			System.out.println("Empty Tree");
			return null;
		}else{
			return remove(root, value);
		}
	}
	
	public Node remove(Node nod, int value){
		if(value < nod.getValue()){
			nod.setLeft(remove(nod.getLeft(), value));
		}else if(value > nod.getValue()){
			nod.setRight(remove(nod.getRight(), value));
		}else if(nod.getLeft() != null && nod.getRight() != null){
			System.out.println("Removing Node: "+nod.getValue());
			nod.setValue(findMinimal(nod.getRight()).getValue());
			nod.setRight(removeMinimal(nod.getRight()));
		}else{
			nod = (nod.getLeft() != null) ? nod.getLeft() : nod.getRight();
		}
		
		return nod;
	}
	
	//Transversals
	public void preorder(){
		preorder(root);
	}
	
	public void preorder(Node nod){
		if(nod != null){
			System.out.print(nod.getValue()+" ");
			preorder(nod.getLeft());
			preorder(nod.getRight());
		}
	}
	
	public void posorder(){
		posorder(root);
	}
	
	public void posorder(Node nod){
		if(nod != null){
			posorder(nod.getLeft());
			posorder(nod.getRight());
			System.out.print(nod.getValue()+" ");
		}
	}
	
	public void inorder(){
		inorder(root);
	}
	
	public void inorder(Node nod){
		if(nod != null){
			inorder(nod.getLeft());
			System.out.print(nod.getValue()+" ");
			inorder(nod.getRight());
		}
	}
	
	//general methods
	public boolean isEmpty(){
		if(root == null){
			return true;
		}else{
			return false;
		}
	}
	
	public int getHeight(){
		return getHeight(root);
	}
	
	public int getHeight(Node nod){
		if(nod == null){
			return 0;
		}
		int leftHeight = getHeight(nod.getLeft());
		int rightHeight = getHeight(nod.getRight());
		if(leftHeight > rightHeight){
			return leftHeight + 1;
		}else{
			return rightHeight + 1;
		}
	}
	
	public int nodeCount(){
		return nodeCount(root);
	}
	
	public int nodeCount(Node nod){
		if(nod == null){
			return 0;
		}
		int leftCount = nodeCount(nod.getLeft());
		int rightCount = nodeCount(nod.getRight());
		return leftCount + rightCount + 1;
	}
	
	public Node findMinimal(Node nod){
		if(nod != null){
			while (nod.getLeft() != null){
				nod = nod.getLeft();
			}
		}
		return nod;
	}
	
	public Node removeMinimal(Node nod){
		if(nod == null){
			return null;
		}else if(nod.getLeft() != null){
			nod.setLeft(removeMinimal(nod.getLeft()));
			return nod;
		}else{
			return nod.getRight();
		}
	}
	
}
