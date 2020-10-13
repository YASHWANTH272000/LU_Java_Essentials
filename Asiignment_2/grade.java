import java.lang.*;
class grade{
	float c,e;
	float d;
	void perc(int sub1,int sub2,int sub3,int sub4,int sub5){
		d=(sub1+sub2+sub3+sub4+sub5);
		e=d/500;
		c=e*100;
		System.out.println("Percentage is : "+c);
		if (c>=95){
			System.out.println("\nGrade : A");
		}
		else if (c>=60 && c<95){
			System.out.println("\nGrade : B");
		}
		else if (c>=35 && c<60){
			System.out.println("\nGrade : C");
		}
		else 
			System.out.println("\nFail");
	}
	public static void main(String args[]){
		grade obj=new grade();
		obj.perc(35,45,55,65,98);
	}
}