class Employee{
	String name,city;
	int age;
	
	void function(String name,int age,String city){
		System.out.println("\nEmployee name : "+name);
		System.out.println("\nEmployee age  : "+age);
		System.out.println("\nEmployee city : "+city);
	}
	public static void main(String args[]){
		System.out.println("\nEmployee details \n");
		Employee d=new Employee();
		d.function("Yash",20,"Banglore");
}
}