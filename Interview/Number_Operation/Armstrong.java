import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int digit=0;
        int temp=num;
        int temp1=num;
        while(temp!=0)
        {
            temp=temp/10;
            digit++;
        }
        while(num!=0)
        {
           int rem=num%10;
           sum=sum+(int)Math.pow(rem,digit);
           num=num/10;
        }
        if(temp1==sum)
        {
            System.out.println("Armstrong Number");
        }else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}
// 3: 3^1 = 3 

// 153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153

// 125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

// 1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643

