import java.util.*;
class CreditScore
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE CREDIT SCORE");
        int score=sc.nextInt();
       if(score>=400 && score<=600)
       {
        System.out.println("SILVER CARD");
       }
        else if(score>=600 && score<=800)
       {
        System.out.println("GOLD CARD");
       }
        else if(score>=800 && score<=850)
       {
        System.out.println("PLATINUM CARD");
       }
    }
}