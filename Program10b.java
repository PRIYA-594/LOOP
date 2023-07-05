package Loops;
import java.lang.Math;
public class Program10b {
	public static void main(String args[])
	{
		int i=200;
		do
		{
			int c = (int)Math.log10(i);
			int f = (int)(i/(int)(Math.pow(10, c)));
			int l = i%10;
			System.out.println(f+l);
			i++;
		}while(i<=500);
	}
}
