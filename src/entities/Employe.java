package entities;

public class Employe {
	private int id;
	private String name;
	private Double salary;
	public Employe(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return 
				id 
				+","
				+ name
				+","
				+ String.format("%.2f", getSalary());
				
	}
	
	public void inSalary (double percentage){
		this.salary = getSalary() * percentage/100 + getSalary();
	}

}
