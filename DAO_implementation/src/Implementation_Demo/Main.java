package Implementation_Demo;
import java.util.*;
public class Main extends Demo1 {
	public static void main(String args[])
	{
		Main obj=new Main();
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two nos");
		a=sc.nextInt();
		b=sc.nextInt();
		obj.add(a,b);
		obj.substract(a, b);
		obj.multiply(a, b);
		obj.divide(a, b);
		
		
	}

}
