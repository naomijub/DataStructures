
public class Queue {

	private Nod first;
	private Nod last;
	
	public Queue(){
		first = null;
		last = null;
	}
	
	public void add(String name){
		Nod aux = new Nod(name);
		if(first == null){
			first = aux;
			last = aux;
		}else{
			if(last == first){
				aux.setPrev(first);
				last = aux;
			}else{
				aux.setPrev(last);
				last = aux;
			}
		}
	}
	
	public void peek(){
		System.out.println("ID: "+first.getObj().getID()+" Name: "+first.getObj().getName());
	}
	
	public Nod second(){
		Nod aux = last;
		while(aux.getPrev() != first){
			aux = aux.getPrev();
		}
		return aux;
	}
	
	public Nod poll(){
		Nod aux = first;
		first = second();
		first.setPrev(null);
		
		return aux;
	}
	
	public void printNod(Nod aux){
		System.out.println("ID: "+aux.getObj().getID()+" Name: "+aux.getObj().getName());
	}
}
