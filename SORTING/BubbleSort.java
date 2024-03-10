import java.util.*;
class BubbleSort
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n=ref.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=ref.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}