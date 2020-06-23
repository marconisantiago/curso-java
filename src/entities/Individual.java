package entities;

public class Individual extends TaxPayer {

	private Double healthEpenditures;

	public Individual() {
		super();

	}

	public Individual(String name, Double anualIncome, Double healthEpenditures) {
		super(name, anualIncome);
		this.healthEpenditures = healthEpenditures;
	}

	public Double getHealthEpenditures() {
		return healthEpenditures;
	}

	public void setHealthEpenditures(Double healthEpenditures) {
		this.healthEpenditures = healthEpenditures;
	}

	@Override
	public Double tax() {
		if (getAnualIncome() < 20000.00 ) {
			return getAnualIncome() * 0.15;
		} 
		
		else {
			return getAnualIncome() * 0.25 - getHealthEpenditures()
					* 0.50;
		}

			//if (getAnualIncome() > 20000.00 && getHealthEpenditures() == 0) {
			//return getAnualIncome() * 0.25;

	//	} 
		
		//	else {
			//return getAnualIncome() * 0.25 - getHealthEpenditures()
			//		* 0.50;

		//}
	}
	
}
	


