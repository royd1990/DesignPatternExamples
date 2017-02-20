package Visitor;

public class Necessity implements Visitable{

	private double price;

	Necessity(double item) {
		price = item;
	}

	public double accept(Visitor taxCalc) {
		return taxCalc.visit(this);
	}
	

	public double getPrice() {
		return price;
	}

}
