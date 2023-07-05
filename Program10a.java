package Loops;
import java.lang.Math;
public class Program10a {
	public static void main(String args[])
	{
		int i=200;
		while(i<=500)
		{
			int c = (int)Math.log10(i);
			int f = (int)(i/(int)(Math.pow(10, c)));
			int l = i%10;
			System.out.println(f+l);
			i++;
		}
	}
}
