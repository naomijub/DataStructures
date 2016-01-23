
public class Obj {
	private String name;
	private int ID;
	private static int IDGen = 0;
	
	//Constructor
	public Obj(String name){
		this.ID = IDGen;
		this.name = name;
		IDGen++;
	}

	//get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	public void print(){
		System.out.println("ID: " + ID + " Name: "+name);
	}
}
