
public class Nod {

	private Obj obj;
	private Nod prev;
	
	public Nod(){
		obj = null;
		prev = null;
	}
	
	public Nod(Obj obj){
		this.obj = obj;
		this.prev = null;
	}
	
	public Nod(String name){
		Obj obj = new Obj(name);
		this.obj = obj;
		this.prev = null;
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
	
	
}
