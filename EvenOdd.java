import java.util.Scanner;
class EvenOdd
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int n=sc.nextInt();
      
           if(n<=0)
        
            System.out.println("INVALID NO");
        else if(n>=0 && n%2==0)
        System.out.println("EVEN");
        
        else if(n>=0 && n%2!=0)
        System.out.println("ODD");

       
        
        }
}
      
        
   