import java.util.*;
class QuickSort
{
    int partition(int a[],int start,int end)
    {
        int pivot=a[end];
        int pindex=start;
        for(int i=start;i<end-1;i++)
        {
            if(a[i]<=pivot)
            {
                int temp=a[pindex];
                a[pindex]=a[i];
                a[i]=temp;
                pindex++;
            }
        }
       // int t;
        int temp=a[pindex];
        a[pindex]=a[end];
        a[end]= temp;
        return (pindex);
    }

    void Quick1(int a[],int start,int end)
    {
        if(start<end)
        {
            int p=partition(a,start,end);
            Quick1(a,start,p-1);
            Quick1(a,p+1,end);
        }
    }
}   
    class Quick
    {
    public static void main(String args[])
    {
        int i,j,temp;
        Scanner ref=new Scanner(System.in);
        System.out.println("Enter number of element:");
        int n=ref.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=ref.nextInt();
        }
        QuickSort q1=new QuickSort();
        q1.Quick1(a,0,n-1);

        for( i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
