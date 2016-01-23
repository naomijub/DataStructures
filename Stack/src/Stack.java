
public class Stack {
	
	private Nod top;
	
	public Stack(){
		top = null;
	}
	
	public void push(String name){
		Nod aux = new Nod(name);
		if(top == null){
			top = aux;
		}else{
			aux.setPrev(top);
			top = aux;
		}
	}
	
	public Nod pull(){
		Nod aux = top;
		Nod retAux;
		if(aux.getPrev() == null){
			retAux = top;
			top = null;
			return retAux;
		}else{
			retAux = top;
			retAux.setPrev(null);
			top = aux.getPrev();
			return retAux;
		}
	}
	
	public void lookTop(){
		System.out.println("ID: "+top.getObj().getID()+" Name: "+top.getObj().getName());
	}
	
	public void printNod(Nod aux){
		System.out.println("ID: "+aux.getObj().getID()+" Name: "+aux.getObj().getName());
	}
	
	public void popAll(){
		while(top != null){
			printNod(pull());
		}
	}
}
