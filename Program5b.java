package Loops;
import java.lang.Math;
public class Program5b {
	public static void main(String args[])
	{
		int i = 100;
		do
		{
			int t = (int)Math.log10(i)+1;
			i = (int)(i/Math.pow(10, t))/10;
			System.out.println(i);
			i++;
		}while(i<=150);
	}
}
