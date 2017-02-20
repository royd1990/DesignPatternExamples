package Observer2;

public class ObserverTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject s = new Subject(0);
		ObserverNew o = new ObserverNew(s);
		Observer2 o2 = new Observer2(s);
		s.addObserver(o);
		s.addObserver(o2);
		System.out.println(s.countObservers());
		s.setValue(5);
		
	}

}
