import java.util.Scanner;
class LeapYear
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A YEAR:");
        int n=sc.nextInt();

      if((n % 400 == 0) ||
       (n % 100 != 0) && 
       (n % 4 == 0))
      System.out.println("LEAP YEAR");
      else
      System.out.println("NOT LEAP YEAR");
     


       
        
        }
}
      
        
   