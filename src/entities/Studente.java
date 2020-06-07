package entities;

public class Studente {

	public String name;
	public double notaSem1;
	public double notaSem2;
	public double notaSem3;
	public double soma;
	
	public double notaFim() {

		if (notaSem1 <= 30 && notaSem2 <= 35 && notaSem3 <= 35) {

			soma = notaSem1 + notaSem2 + notaSem3;
			return soma;
		}

		return 0.0;
	}
	public double missingPoint() {
		if (soma <60) {
			return 60 - soma;
			
		}
		return 0.00;
				
		
	}

}
