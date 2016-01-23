
public class List {

	private Nod first;
	
	//constructor
	public List(){
		this.first = null;
	}

	//get set
	public Nod getFirst() {
		return first;
	}

	public void setFirst(Nod first) {
		this.first = first;
	}
	
	//add
	public void add(String name){
		Nod nodAux = new Nod(name);
		if(first == null){
			first = nodAux;
		}else{
			Nod aux = first;
			while(aux.hasNext()){
				aux = aux.getNext();
			}
			aux.setNext(nodAux);
		}
	}
	
	public void add(Obj obj){
		Nod nodAux = new Nod(obj);
		if(first == null){
			first = nodAux;
		}else{
			Nod aux = first;
			while(aux.hasNext()){
				aux = aux.getNext();
			}
			aux.setNext(nodAux);
		}
	}
	
	public Nod findName(String name){
		if(first == null){
			return null;
		}else{
			Nod aux = first;
			while(aux != null){
				if(aux.getObj().getName().equalsIgnoreCase(name)){
					return aux;
				}else{
					aux = aux.getNext();
				}	
			}
			return null;		
		}
	}
	
	public Nod findPrevious(String name){
		Nod aux = first;
		if(first == null){
			return null;
		}else{
			if(aux.getObj().getName().equalsIgnoreCase(name)){
				return null;
			}else{
				while(!aux.getNext().getObj().getName().equalsIgnoreCase(name)){
					aux = aux.getNext();
				}
				return aux;
			}
		}
	}
	
	public boolean remove(String name){
		Nod mainAux = findName(name);
		Nod prevAux = findPrevious(name);
		Nod aux = mainAux;
		
		while(aux != null){
			aux.getObj().setID(aux.getObj().getID() - 1);
			aux = aux.getNext();
		}
		prevAux.setNext(mainAux.getNext());
		mainAux.setNext(null);
		mainAux.setObj(null);
		
		if(mainAux.getNext() == null && prevAux.getNext() != null){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void printList(){
		Nod aux = first;
		while(aux != null){
			System.out.println("ID: "+ aux.getObj().getID() + " Name: "+ aux.getObj().getName());
			aux = aux.getNext();
		}
	}
}
