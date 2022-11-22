import java.util.Scanner;

public class Palindrome {
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		//String s1="2552";
		String s2 ="";
		for(int i=s1.length()-1 ; i>=0 ; i--)
		{
			s2+=s1.charAt(i);
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("the given string is palindrome");
			
		}
		else
		{
			System.out.println("the given string is not a palindrome");
		}
		
		
		
		
		
	}

}
