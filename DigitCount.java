import java.util.*;
class DigitCount
{
    public static void main(String args[])
        {
      Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
       System.out.println("THE DIGITS ARE:");
        DigitsNumber(n);
         System.out.println( "\nTHE NUMBER OF DIGITS IS: "+count(n));
         System.out.println( "\nTHE SUM OF DIGITS IS: "+sumOfDigits(n));
         System.out.println( "\nTHE SUM OF PRIME DIGITS IS: "+sumOfPrimeDigits(n));
          ReverseNumber(n);
       
        }
     static int count(int n)
     {
         int r=0;int c=0;
        while(n!=0)
        {
           r=n%10;
            n=n/10;
             c++;
        }
          
            return c;

     }
     
     static void DigitsNumber(int n)
     {
        int r = 0;int c=0;
        while(n!=0)
        {
           r=n%10;
           System.out.print(r+"\t");
            n=n/10;
            
        }
        
           
     }
     static void ReverseNumber(int n)
     {
        int r = 0;int c=0;int rev=0;
        while(n!=0)
        {
           r=n%10;
          rev=rev*10+r;
            n=n/10;
             
        }
        
        System.out.println("THE REVERSE OF THE NUMBER IS: "+rev);
           
     }
     static int sumOfDigits(int n)
     {
         int r=0;int sum=0;
        while(n!=0)
        {
           r=n%10;
           sum=sum+r;
            n=n/10;
            
        }
          
            return sum;
     }
    
     static int sumOfPrimeDigits(int n)
     {
         int r=0;int sum=0;
        while(n!=0)
        {
           r=n%10;
           if(isPrime(r)==true)
           sum=sum+r;
            n=n/10;
            
        }
          
            return sum;
     }
     static boolean isPrime(int n)
     {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
       
        
            if(c==2)
            return true;
            else
             return false;
     }
    

    
}