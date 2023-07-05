package Loops;
import java.lang.Math;
public class Program5 {
	public static void main(String args[])
	{
		for(int i=100;i<=150;i++)
		{
			int t = (int)Math.log10(i)+1;
			i = (int)(i/Math.pow(10, t))/10;
			System.out.println(i);
		}
	}
}
