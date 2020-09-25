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
	
	public void printer() {
		System.out.println(weight+" "+ height);
	}
	

	public static void main(String[] args) throws IOException 
	{
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your weight(kg) and height(m)");
		int x=Integer.parseInt(stdin.readLine());
		double y=Double.parseDouble(stdin.readLine());
		Practise obj1=new Practise(x,y);
		int x_x=Integer.parseInt(stdin.readLine());
		double y_y=Double.parseDouble(stdin.readLine());
		Practise obj2=new Practise(x_x,y_y);
		System.out.println("BMI is = " +obj1.BMI());
		obj1.printer();
		obj2.printer();
	}
}