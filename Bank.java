package oop2;

public class Bank { 
	private String name; 
    private Employee[] employees = new Employee[10];
    private int numberOfEmployees=0;
    
	Bank(String name) { 
		this.name = name;
	}
	public void addEmployee(Employee newEmp) {
		employees[numberOfEmployees]=newEmp;
		numberOfEmployees++;
	}
	public String printEmployeesNames() {
		String izhod="";
		izhod+=employees[0].getEmployeeName();
		for(int i=1; i<numberOfEmployees; i++) {
			izhod+=(", " + employees[i].getEmployeeName());
		}
		return izhod;
	}
	public Employee[] getEmployeesList() {
		return employees;
	}
	public String getBankName() { 
		return this.name;
	} 
}  
