import java.util.*;
class DuckNumber
{
    public static  void  main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");
        int n= sc.nextInt();
        if (checkDuck(n)==true)
        {
            System.out.println("IT IS A DUCK NUMBER");
        }
        else
        System.out.println("IT IS NOT A DUCK NUMBER");

    }
     static boolean checkDuck(int n)
    {
        int r=0;int c=0;
     if (n==0)
     return true;

     else if(n!=0)
     {
        while(n!=0)
        {
             r=n%10;
            n=n/10;


            if(r==0)
            c++;
        }
     }
      System.out.print("THE OCCURENCE OF 0 IS "+c+" TIMES\n");
        if(c>1)
    
        return true;    
       
        else 
        return false;
     
        
    }
}