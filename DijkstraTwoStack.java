package algorithms;
import edu.princeton.cs.algs4.Stack;
import java.io.*;
public class DijkstraTwoStack {
	
	public static void main(String[] args)throws IOException {
		Stack <String> ops =new Stack<>();
		Stack <Double> vals =new Stack<>();
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an infix expression");
		String s=stdin.readLine();
		for(int i=0;i<s.length();i++)
		{
			String c=Character.toString(s.charAt(i));
			if(c.equals("("))	{ }
			else if(c.equals("+"))	ops.push(c);
			else if(c.equals("*"))	ops.push(c);
			else if(c.equals("/"))	ops.push(c);
			else if(c.equals("-"))	ops.push(c);
			else if(c.equals(")"))
			{
				String op=ops.pop();
				if(op.equals("+"))
					vals.push(vals.pop()+vals.pop());
				else if(op.equals("-"))
					vals.push(vals.pop()-vals.pop());
				else if(op.equals("/"))
					vals.push(vals.pop()/vals.pop());
				else if(op.equals("*"))
					vals.push(vals.pop()*vals.pop());
			}
			else
				vals.push(Double.parseDouble(c));
		}
		System.out.println(vals.pop());
	}

}
