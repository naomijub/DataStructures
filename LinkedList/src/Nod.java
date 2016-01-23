
public class Nod {

	private Nod next;
	private Obj obj;
	
	//Constructor
	public Nod(Obj obj){
		this.next = null;
		this.obj = obj;
	}
	
	public Nod(String name){
		Obj aux = new Obj(name);
		this.next = null;
		this.obj = aux;
	}
	
	public Nod(){
		this.next = null;
		this.obj = null;
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
	
	public boolean hasNext(){
		if(next == null){
			return false;
		}else{
			return true;
		}
	}
	
}
