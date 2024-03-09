import java.util.*;
class LinearSearch
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n=ref.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=ref.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int k=ref.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                System.out.println("The element found " + i +" index");
                break;
            }
        }
    }
}
