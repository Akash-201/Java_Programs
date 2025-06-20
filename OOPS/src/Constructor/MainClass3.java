package Constructor;

public class MainClass3
{
	public static void main(String[] args) {
		Employee_MethodOverloading emp1=new Employee_MethodOverloading();
		emp1.employeeName="Rupesh";
		emp1.show();
		
		Employee_MethodOverloading emp2=new Employee_MethodOverloading();
		emp2.employeeId=102;
		emp2.employeeCity="Patna";
		emp2.employeeName="Rahul";
		emp2.show(emp2.employeeId, emp2.employeeName, emp2.employeeCity);	}


}
