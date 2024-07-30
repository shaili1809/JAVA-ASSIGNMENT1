import java.util.*;
class ArrayMatrix
{
    public static void main(String args[])
   {
        Scanner sc= new Scanner(System.in);
       
        System.out.println("ENTER ROW:");
        int r=sc.nextInt();
        System.out.println("ENTER COLUMN:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        System.out.println("ENTER THE ARRAY ELEMENTS FOR MATRIX 1: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
        {

            arr[i][j]=sc.nextInt();
        }

        }

         System.out.println("THE ORIGINAL MATRIX 1:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
        {

            System.out.print(arr[i][j]+"\t");
        }
            System.out.println();
        }
        
        System.out.println("ENTER THE ARRAY ELEMENTS FOR MATRIX 2: ");
        int sum[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
        {

            arr2[i][j]=sc.nextInt();
        }

        }
         System.out.println("THE ORIGINAL MATRIX 2:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
        {

            System.out.print(arr2[i][j]+"\t");
        }
            System.out.println();
        }
        System.out.println("THE SUM IS:");

         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
        {

            sum[i][j]=arr[i][j]+arr2[i][j];
        }
            
        }
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
        {
         System.out.print(sum[i][j]+"\t");
        }
             System.out.println();

        }
             System.out.println();


       
        
   }
} 