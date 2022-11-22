import java.util.Scanner;

class Pangram
{
	 
	public static void pangramCheck(String str)
    {
        
        str = str.toLowerCase();
 
        boolean allLetterPresent = true;
 
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
 
            
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
 
        
        if (allLetterPresent)
            System.out.println("Panagram");
        else
            System.out.println("Not a panagram");
    }
 
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        
        pangramCheck(str);
}
}