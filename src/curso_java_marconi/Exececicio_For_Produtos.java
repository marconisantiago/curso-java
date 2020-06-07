package curso_java_marconi;


public class Exececicio_For_Produtos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Soma = 37x38/1 +	36x37/2 + 35x36/2 +....+1x2/37
		
		int prod = 0;
		int y = 38;
		int x = 1;
		
		for(int i=37;i>0; i--) {
			y = i + 1;
			prod = prod + i*y/x;
			x++;
			
		}
		
		System.out.println("A Soma dos produtos é " +prod);
		
	}

}
