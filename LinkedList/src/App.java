
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new List();
		
		list.add("Jorge");
		list.add("Naomi");
		list.add("Johnny");
		Obj obj = new Obj("Cash");
		list.add(obj);
		list.add("Dalton");
		list.add("Boeira");
		list.add("Newton");
		list.add("Heisenberg");
		
		Nod aux = list.findName("Boeira");
		aux.getObj().print();
		System.out.println();
		
		list.printList();
		System.out.println();
		
		list.remove("Dalton");
		list.printList();
		
	}

}
