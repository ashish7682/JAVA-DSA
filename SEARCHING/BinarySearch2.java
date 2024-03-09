import java.util.*;
import java.util.Arrays;
class BinarySearch2
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.println("Enter No. of element:");
        int n=ref.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=ref.nextInt();
        } 
        System.out.println("enter the element you want to found:");
        int t=ref.nextInt();
        Arrays.sort(arr);
        int low=0,high=n-1,mid=0,flag=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==t)
            {
                flag++;
                break;
            }
            else if(arr[mid]>t)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(flag==1)
        {
            System.out.println("The element found on "+mid+ " index");
        }
        else{
            System.out.println("Element not found");
        }
    }
}