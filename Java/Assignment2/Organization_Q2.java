package assignment2;


class Employee{
		
	private float basic_salary;

	public Employee(float basic_salary, float it) {
		this.basic_salary=basic_salary - it;
	}

	public float basic_salary(){
		return basic_salary;
	}
}

class Manager extends Employee{
	public float  incentive;
	public float basic_salary;
	public float it;
	public Manager(float basic_salary,float it, float incentive ) {
		super(basic_salary, it);
		// TODO Auto-generated constructor stub
		this.incentive = incentive;
	}
	//override
	public float basic_salary() {
		return super.basic_salary() + incentive ;
	}
}
	
	 class labour extends Employee{
		public float  overtime;
		public float basic_salary;
		public float it;
		public labour (float basic_salary , float it, float overtime) {
			super(basic_salary, it);
			// TODO Auto-generated constructor stub
			this.overtime = overtime	;
		}
		//override
		public float basic_salary() {
			return super.basic_salary() + overtime;
		    
		}
	}
	
	public class Organization_Q2
	{
		public static void main(String[] args) {

			float salary = 3000;
			float incentives = 1000;
			float Overtime = 2000;
			float it = 50;

			Manager manager = new Manager(salary, it, incentives);
			labour labour = new labour(salary,it,Overtime);
			System.out.println(manager.basic_salary());
			System.out.println(labour.basic_salary());	

		}
	}