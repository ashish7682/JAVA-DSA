import java.util.*;
class Div_Two_Number_Without_Operator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int count=0;
        while(x>=y)
        {
            x=x-y;
            count++;
        }
        System.out.println(count);
    }
}