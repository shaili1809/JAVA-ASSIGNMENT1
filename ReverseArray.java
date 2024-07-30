import java.util.*;
class ReverseArray
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
                System.out.println("\nTHE REVERSED ARRAY IS:");
                int rev[]=new int [n];
                int j=n;
                for(int i=0;i<n;i++)
                {
                    rev[j-1]=arr[i];
                    j=j-1;
                }
                for(int k=0;k<n;k++)
                {
                    System.out.print(rev[k]+"\t");
                }


   }
}