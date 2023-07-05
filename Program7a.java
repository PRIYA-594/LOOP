package Loops;
import java.util.*;
import java.lang.Math;
public class Program7a {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n)
		{
			System.out.println((int)Math.log10(i));
			i++;
		}
		s.close();
	}
}
