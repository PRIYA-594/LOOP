package Loops;
import java.lang.Math;
public class Program10 {
	public static void main(String args[])
	{
		for(int i=200;i<=500;i++)
		{
			int c = (int)Math.log10(i);
			int f = (int)(i/(int)(Math.pow(10, c)));
			int l = i%10;
			System.out.println(f+l);
		}
	}
}
