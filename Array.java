
import java.util.*;
class Array
{
    public static void main(String args[])
   {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("THE ORIGINAL ARRAY IS:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }    
         System.out.println("\nTHE SUM OF EVEN NUMBER OF ARRAYS IS:"+sumOfArray(n,arr));
         System.out.println("\nTHE SUM OF POSITIVE NUMBERS OF AN ARRAYS IS:"+sumOfPos(n,arr));
         System.out.println("\nTHE SUM OF NEGATIVE NUMBERS OF AN ARRAYS IS:"+sumOfNeg(n,arr));
           

    }
    static int sumOfArray(int n,int arr[])
    {
         int sum=0;
        for(int i=0;i<n;i++)
        {
               if(even(arr[i])==true)
               sum=sum+arr[i];
               
        }
        return sum;
       
       
    }
    static int sumOfPos(int n,int arr[])
    {
         int sum=0;
        for(int i=0;i<n;i++)
        {
               if((arr[i])>0)
               sum=sum+arr[i];
               
        }
        return sum;
       
       
    }
    static int sumOfNeg(int n,int arr[])
    {
        
         int sum=0;
        for(int i=0;i<n;i++)
        {
               if((arr[i])<0)
               sum=sum+arr[i];
               
        }
        return sum;
       
       
       
    }
   

    static boolean even(int n)
    {
        
           if(n<=0)
          
             return false;
           

        else if(n>=0 && n%2==0)
        return true;
        
        else 
        return false;
    }
      
         
         
}