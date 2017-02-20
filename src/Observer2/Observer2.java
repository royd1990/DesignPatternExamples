package Observer2;

import java.util.Observable;
import java.util.Observer;

public class Observer2 implements Observer {
	
	public Subject s = null;
	
	public Observer2(Subject s){
		this.s = s;
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if(s==o){
			System.out.println(s.getValue());
		}

	}

}
