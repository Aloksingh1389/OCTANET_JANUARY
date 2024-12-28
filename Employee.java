class Employee
{
	int empId;
	String empName;
	
	Employee(int id,String name)
	{
		empId=id;
		empName=name;
	}
	void info()
	{
		System.out.println("Id: "+empId+"\t"+"Name: "+empName);
	}
public static void main(String[] args)
{
	Employee obj1=new Employee(1234,"Mayank singh");
	Employee obj2=new Employee(1235,"Alok singh");
	Employee obj3=new Employee(1235,"Alok singh");
	Employee obj4=new Employee(1235,"Vishal singh");
	Employee obj5=new Employee(1235,"Nikhil singh");
	Employee obj6=new Employee(1235,"Atul singh");
	Employee obj7=new Employee(1235,"Apurv singh");
	obj1.info();
	obj2.info();
	obj3.info();
	obj4.info();
	obj5.info();
	obj6.info();
	obj7.info();
}
}