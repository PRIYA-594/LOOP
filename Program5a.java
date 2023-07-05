package Loops;
import java.lang.Math;
public class Program5a {
	public static void main(String args[])
	{
		int i =100;
		while(i<=150)
		{
			int t = (int)Math.log10(i)+1;
			i = (int)(i/Math.pow(10, t))/10;
			System.out.println(i);
			i++;
		}
	}
}
