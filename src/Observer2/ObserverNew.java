package Observer2;

import java.util.Observable;
import java.util.Observer;

public class ObserverNew implements Observer {
	private Subject s = null;
	public ObserverNew(Subject s){
		this.s = s;
	}
	public void update(Observable o, Object arg) {
		if(o==s){
			System.out.println(s.getValue());
		}
		
	}

}
