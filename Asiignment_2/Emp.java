import java.util.*;
class Employee{
	//public static scanner sc;
	static float tax;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name\n");
		String name=sc.nextLine();
		System.out.println("Enter employee DOB\n");
		String DOB=sc.nextLine();
		System.out.println("Enter employee Salary\n");
		int salary=sc.nextInt();
		
		if (salary>=0 && salary<=200000){
			tax=(salary*0.05f);
		}
		else if (salary>200000 && salary<=300000){
			tax=salary*0.010f;
		}
		else if (salary>300000 && salary<=400000){
			tax=salary*0.015f;
		}
		else if (salary>400000){
			tax=salary*0.020f;
		}
		else{
			System.out.println("Enter correct salary amount\n");
		}
		System.out.println("\n\nemployee Details :\nName:"+name+"\nDOB:"+DOB+"\nSalary:"+salary+"\nTax amount:"+tax);
		
	}
}