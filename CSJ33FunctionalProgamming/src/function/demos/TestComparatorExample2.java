package function.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
	
	private int empId;
	private String empName;
	private double empSalary;
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public String toString()
	{
		return empId+ " ----"+empName+ "-----"+empSalary;
	}
	
}
public class TestComparatorExample2 {

	public static void main(String[] args) {
List<Employee> listOfEmp=new ArrayList();
listOfEmp.add(new Employee(108, "B", 244343.00));
listOfEmp.add(new Employee(1, "A", 844343.00));
listOfEmp.add(new Employee(18, "T", 244343.00));
listOfEmp.add(new Employee(8, "D", 144343.00));
listOfEmp.add(new Employee(188, "P", 6744343.00));

//sort employee based on salary
Comparator<Employee> cmp1=(e1,e2)->
{
	if(e1.getEmpSalary()<e2.getEmpSalary())
	{
		return 1;
	}
	return -1;
};
Collections.sort(listOfEmp,cmp1);
for(Employee e:listOfEmp)
{
	System.out.println(e);
}
//sort the employee based on their name;
System.out.println("sorting based on name of employee");
Comparator<Employee> cmp2=(e1,e2)->
{
	//int compareTo(String str)
	//The above method is availabe inside String 
	//The method compare two string  lexicographicaly
	//if first object of string > second object of string then it return positive integer
	//if first string < second string then it returns negetive integer
	//if first string == second string it returns 0
	return e1.getEmpName().compareTo(e2.getEmpName());
};
Collections.sort(listOfEmp,cmp2);

for(Employee e:listOfEmp)
{
	System.out.println(e);
}


}

}
