import java.util.*;
class SelectionSort
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.println("Enter the no. of the element:");
        int n=ref.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elemnt:");
        for(int i=0;i<n;i++)
        {
            arr[i]=ref.nextInt();
        }
        int min;
        for(int i=0;i<n-1;i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
         for(int i=0;i<n;i++)
            {
                System.out.println("arr["+i+"]="+arr[i]);
            }
    }
}