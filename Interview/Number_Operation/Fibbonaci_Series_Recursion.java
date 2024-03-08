import java.util.*;
class Fibbonaci_Series_Recursion
{
    static int a=0,b=1,c;
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       System.out.println(a+" "+b);
       Fibbonaci_Series_Recursion obj=new Fibbonaci_Series_Recursion();
       obj.printFib(n);
    }
    void printFib(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            printFib(i-1);
        }
    }
}