package Observer2;

import java.util.Observable;

public class Subject extends Observable{
	private int n;
	
	public Subject(int n){
		this.n = n;
	}
	
	public void setValue(int n){
		this.n = n;
		setChanged();
		notifyObservers();
	}
	
	public int getValue(){
		return n;
	}
	

}
