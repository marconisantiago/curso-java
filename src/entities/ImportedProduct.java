package entities;

public class ImportedProduct extends Product1 {

	
	private Double customsFee;
	
	public ImportedProduct(){
		super();		
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice(){
		return getPrice() + getCustomsFee();
	}
		
	@Override
	public String priceTag(){
		return getName()
				+ " $ "
				+ "(Customs fee: $ "
				+ String.format("%.2f",customsFee)
				+ ")";
		}
	
	
}

