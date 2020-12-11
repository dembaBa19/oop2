package oop2;

class Project17 {
	public static void main (String[] args)  {
		Bank bank1 = new Bank("Zouma Bank"); 
		Employee emp1 = new Employee("Reece James");
		Employee emp2 = new Employee("Benjamin Chilwell");
		emp1.setBank(bank1);
		(emp1.getBank()).addEmployee(emp1);
		emp2.setBank(bank1);
		(emp2.getBank()).addEmployee(emp2);
		System.out.println(emp1.getEmployeeName() +  
				" is employee of " + (emp1.getBank()).getBankName());
		System.out.println(bank1.printEmployeesNames() +  
			" are employees of " + bank1.getBankName());
		Information info1 = new Information();
		info1.setAge(21);
		info1.setGender("Male");
		info1.setSalary(2300);
		emp1.setInfo(info1);
		System.out.println(emp1.getEmployeeName() +
				" is " + (emp1.getInfo()).getAge() +
				" years old and " + (emp1.getInfo()).getGender() + 
				". Salary : " + (emp1.getInfo()).getSalary());
		
		
	} 
}