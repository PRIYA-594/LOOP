package Loops;
import java.util.*;
import java.lang.Math;
public class Program7 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i =1;i<=n;i++)
		{
			System.out.println((int)Math.log10(i));
		}
		s.close();
	}
}
