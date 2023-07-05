package Loops;
import java.util.*;
public class Program8 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		s.close();
	}
}
