
public class Nod {

	private Nod next;
	private Obj obj;
	private Nod prev;
	
	//Constructor
	public Nod(Obj obj){
		this.next = null;
		this.obj = obj;
		this.prev = null;
	}
	
	public Nod(String name){
		Obj aux = new Obj(name);
		this.next = null;
		this.obj = aux;
		this.prev = null;
	}
	
	public Nod(){
		this.next = null;
		this.obj = null;
		this.prev = null;
	}

	//get set
	public Nod getNext() {
		return next;
	}

	public void setNext(Nod next) {
		this.next = next;
	}

	public Obj getObj() {
		return obj;
	}

	public void setObj(Obj obj) {
		this.obj = obj;
	}
	
	public Nod getPrev() {
		return prev;
	}

	public void setPrev(Nod prev) {
		this.prev = prev;
	}

	public boolean hasNext(){
		if(next == null){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean hasPrev(){
		if(prev == null){
			return false;
		}else{
			return true;
		}
	}
}