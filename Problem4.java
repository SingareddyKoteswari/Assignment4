import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		int consonants=0;
		int vowels=0;
		int special_characters=0;
		char ch;
		for(int i=0; i<s.length(); i++)
		{
			ch=s.charAt(i);
			if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))
			{
				if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				{
					vowels++;
				}
				else
				{
				consonants++;
				}
			}
			else
			{
				special_characters++;
			}
		}
		System.out.println("no.of consonants are" +consonants);
		System.out.println("no.of vowels are" +vowels);
		System.out.println("no.of special characters are" +special_characters);
		

	}

}
