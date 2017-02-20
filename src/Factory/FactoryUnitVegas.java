package Factory;

public class FactoryUnitVegas implements ToyFactory {

	@Override
	public Toy makeToy(String toy) {
		if(toy.equals("C")){
			return new CaptainAmerica();
		}
		else if(toy.equals("M")){
			return new MickeyMouse();
		}
		else{
			return null;
		}
	}

}
