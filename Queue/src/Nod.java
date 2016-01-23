
public class Nod {

	private Obj obj;
	private Nod prev;
	
	public Nod(){
		prev = null;
		obj = null;
	}
	
	public Nod(String name){
		Obj obj = new Obj(name);
		prev = null;
		this.obj = obj;
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
