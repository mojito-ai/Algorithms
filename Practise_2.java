package algorithms;
import java.io.*;
public class Practise_2 {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		outer:
			for(int i=0;i<100;i++)
			{
				System.out.print(i+" ");
				if (i>50) break outer;
			}
		;
		;
	}

}
