import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
    //sorting
	public static void sorting(char[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for( int j=0;j<arr.length ;j++)
			{
				if(arr[i]<arr[j])
				{
					char temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
			}
		}
		String s3 = "";
		for (int k=0;k<arr.length;k++)
		{
			s3+=arr[k];
			
		}
		
		
		System.out.println("sorted strings are :" +s3);
		//System.out.println("sorted strings are :" +s4);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc.nextLine();
		System.out.println("enter the second String");
		String s2=sc.nextLine();
		String s3="";
		String s4="";
		s1.toLowerCase();
		s2.toLowerCase();
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		
		sorting(arr1);
		sorting(arr2);
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}

}
}