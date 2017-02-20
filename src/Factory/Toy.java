package Factory;

public abstract class Toy {
	private String name;
	private String type;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getType(){
		return type;	
	}
	public void setType(String type){
		this.type = type;
	}
	
	public void describeToy(){
		System.out.println("This is vintage "+type+" "+name);
	}

}
