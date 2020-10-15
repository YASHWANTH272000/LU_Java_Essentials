import java.util.*;
class array{
	public static void main(String args[]){
		int a[]=new int[5];
		int b=0;
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
			
		for (int i=0;i<5;i++)
		{	
			
			b=b+a[i];
				
	        }
		System.out.println(b+"\n");	
} 
}