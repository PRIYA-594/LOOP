package Loops;
import java.util.Scanner;
public class Program8a {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int i = 0;
		while(i<str.length())
		{
			System.out.println(str.charAt(i));
			i++;
		}
		s.close();
	}
}
