package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import entities.enums.WorkerLevel;

public class Worker {
	
	//Atributos basicos	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//Assossia��es
	private Department department;
	private List<HourContracts> contracts = new ArrayList<>();
	
	public Worker(){
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary,
			Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContracts> getContracts() {
		return contracts;
	}

	//M�todos	
	
	public void addContract(HourContracts contract){
       contracts.add(contract);
    }
	public void removeContract(HourContracts contract){
	       contracts.remove(contract);
	}
	
	public Double income(int year, int month){
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContracts c : contracts){
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month){
				sum+= c.totalValue();
			}
				
	}
	return sum;
}
}