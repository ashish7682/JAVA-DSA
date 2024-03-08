import java.util.*;
class Add_Two_Number_Without_Operator2
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    while(y!=0)
    {
        x++;
        y--;
    }
    System.out.println(x);
    }
}