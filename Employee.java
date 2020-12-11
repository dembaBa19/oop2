package oop2;

public class Employee {
	private Bank bank;
	private String name;
	private Information info;
	  
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	Employee(String name) { 
		this.name = name;
	}
	public Bank getEmployeeBank() {
		return this.bank;
	}
	public String getEmployeeName() { 
		return this.name;
	}
	public Information getInfo() {
		return info;
	}
	public void setInfo(Information info) {
		this.info = info;
	}
} 
