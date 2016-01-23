
public class List {
	private Nod first;
	private Nod last;
	
	//constructor
	public List(){
		this.first = null;
		this.last = null;
	}

	//get set
	public Nod getFirst() {
		return first;
	}

	public void setFirst(Nod first) {
		this.first = first;
	}

	public Nod getLast() {
		return last;
	}

	public void setLast(Nod last) {
		this.last = last;
	}
	
	//add
		public void add(String name){
			Nod nodAux = new Nod(name);
			if(first == null){
				first = nodAux;
				last = nodAux;
			}else{
				Nod aux = first;
				while(aux.hasNext()){
					aux = aux.getNext();
				}
				aux.setNext(nodAux);
				last = nodAux;
				nodAux.setPrev(aux);
			}
		}
		
		public void add(Obj obj){
			Nod nodAux = new Nod(obj);
			if(first == null){
				first = nodAux;
				last = nodAux;
			}else{
				Nod aux = first;
				while(aux.hasNext()){
					aux = aux.getNext();
				}
				aux.setNext(nodAux);
				last = nodAux;
				nodAux.setPrev(aux);
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
		
		public Nod findNext(String name){
			if(first == null){
				return null;
			}else{
				Nod aux = first;
				while(aux != null){
					if(aux.getObj().getName().equalsIgnoreCase(name)){
						return aux.getNext();
					}else{
						aux = aux.getNext();
					}	
				}
				return null;		
			}
		}
		
		public boolean remove(String name){
			Nod mainAux = findName(name);
			Nod prevAux = findPrevious(name);
			Nod nextAux = findNext(name);
			Nod aux = mainAux;
			
			while(aux != null){
				aux.getObj().setID(aux.getObj().getID() - 1);
				aux = aux.getNext();
			}
			prevAux.setNext(mainAux.getNext());
			nextAux.setPrev(mainAux.getPrev());
			mainAux.setNext(null);
			mainAux.setObj(null);
			mainAux.setPrev(null);
			
			if(mainAux.getNext() == null && prevAux.getNext() != null && nextAux.getPrev() != null){
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
		
		public void printBack(){
			Nod aux = last;
			while(aux != null){
				System.out.println("ID: "+ aux.getObj().getID() + " Name: "+ aux.getObj().getName());
				aux = aux.getPrev();
			}
		}
}
