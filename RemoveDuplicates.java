import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String  s=sc.nextLine();
		char[] arr=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		//boolean repeated=false;
		for(int i=0; i<arr.length; i++)
		{
			boolean repeated=false;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					repeated=true;
					break;
				}
			}
			if(repeated==false)
			{
				sb.append(arr[i]);
				
			}
			
		}
		System.out.println("the string without the duplicates are :" +sb);
	
		
			
		

	}

}
