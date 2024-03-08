// Palindrome number in java: A palindrome number is a number that is same after reverse. 
// For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
// It can also be a string like LOL, MADAM etc.
import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num!=0)
        {
            int rem=num % 10;
            sum = sum*10+rem;
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("Palindrome Number");
        }else
        {
            System.out.println("Not a palindrome number");
        }
    }
}