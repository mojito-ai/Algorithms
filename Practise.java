package algorithms;
import java.io.*;
public class Practise {
	static int over=100;
	private int weight;
	private double height;
	Practise(int a, double b){
		this.weight=a;
		this.height=b;
	}
	
	protected double BMI() {
		double bmi=weight/Math.pow(height,2);
		return bmi;
	}
	
	public static void scale() {
		System.out.println("Overweight over= "+over);
	}
	

	public static void main(String[] args) throws IOException 
	{
		System.exit(1);
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your weight(kg) and height(m)");
//		int x=Integer.parseInt(stdin.readLine());
//		double y=Double.parseDouble(stdin.readLine());
//		Practise obj1=new Practise(x,y);
//		System.out.println("BMI is = " +obj1.BMI());
		Practise.scale();
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("! Mohit");
		System.out.println(sb);
		System.out.println(Practise.over);
	}
}

public class STUDENT{
}

