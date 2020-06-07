package entities;

public class Employes {
	
	public String name;
	public double grossSalary;
	public double taxi;
	
	public double netSalary() {
	return  grossSalary - taxi;
			}	
	public void increasySalary (double percentage) {
	this.grossSalary += grossSalary * (percentage/100);
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());

}
}
