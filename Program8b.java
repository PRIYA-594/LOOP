package Loops;
import java.util.Scanner;
public class Program8b {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int i = 0;
		do
		{
			System.out.println(str.charAt(i));
		}while(i<str.length());
		s.close();
	}
}
