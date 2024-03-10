import java.util.*;
class InsertionSort
{
    public static void main(String args[])
    {
        int j,temp;
        Scanner ref=new Scanner(System.in);
        System.out.println("Enter number of Element:");
        int n=ref.nextInt();
        int Arr[]=new int[n];
        System.out.println("Enter Array element:");
        for(int i=0;i<n;i++)
        {
            Arr[i]=ref.nextInt();
        }
        for(int i=1;i<=n-1;i++)
        {
            temp=Arr[i];
            j=i-1;
            while(temp<Arr[j]  && j>-1)
            {
                Arr[j+1]=Arr[j];
                j=j-1;
            }
            Arr[j+1]=temp;
        }
        System.out.println("After Sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
}