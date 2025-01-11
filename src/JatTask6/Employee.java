package JatTask6;

public class Employee {
	int id;
	String firstName;
	String lastname;
	static int salary;
	public Employee(int id, String firstName, String lastname, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.salary = salary;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create an object for an employee
		Employee empObj=new Employee(10,"Geetha","Saran",300000);
		System.out.println("Employee Deatils");
		System.out.println("ID:"+empObj.getId());
		System.out.println("FirstName:"+empObj.getFirstName());
		System.out.println("Lastname:"+empObj.getLastname());
		System.out.println("Salary:"+empObj.getSalary());
		empObj.raiseSalary(300000);
		empObj.annualSalary(salary);
		
		

	}
	
	public int raiseSalary(int percent)
	{
		if(percent >0)
		{
			salary=salary*(percent/100);
		}
		else 
		{
			System.out.println("Percentage must be positive");
		}
		return salary;
	}
	public void annualSalary(int salary)
	{
		int annualSalary=12*salary;
		System.out.println("Annual salary is:"+annualSalary);
	}
}
	


