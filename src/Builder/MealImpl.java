package Builder;

public class MealImpl implements Meal {
	

	private int nbPersons;
	private String  location;
	private double budget;

	private MealImpl(MealBuilder builder) {
		nbPersons = builder.nbPersons;
		location = builder.location;
		budget = builder.budget;
	}

	@Override
	public int getNumberOfPerson() {
		return nbPersons;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public double getBudget() {
		return budget;
	}
	
	public static class MealBuilder {
		private int nbPersons;
		private String location;
		private double budget;
		public MealBuilder(int nbPersons){
			this.nbPersons = nbPersons;
		}
		
		public MealBuilder location(String l){
			this.location = l;
			return this;
		}
		
		public Meal build(){
			return new MealImpl(this);
		}
	}

}
