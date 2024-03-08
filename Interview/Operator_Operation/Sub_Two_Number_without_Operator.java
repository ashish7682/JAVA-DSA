import java.util.*;
class Sub_Two_Number_without_Operator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sub=a+(~b)+1;
        System.out.println(sub);
    }
}