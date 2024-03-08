import java.util.*;
class Mul_Two_Number_Without_Operator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=0;
        for(int i=1;i<=x;i++)
        {
            sum=sum+y;
        }
        System.out.println(sum);
    }
}