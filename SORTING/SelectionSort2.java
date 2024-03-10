import java.util.*;
class SelectionSort2
{
  public static void main(String args[])
  {
    int loc,temp;
    Scanner ref=new Scanner(System.in);
    System.out.println("Enter number of element:");
    int n=ref.nextInt();
    int Arr[]=new int[n];
    System.out.println("Enter Array element:");
    for(int i=0;i<n;i++)
    {
        Arr[i]=ref.nextInt();
    }
    for(int i=0;i<n-1;i++)
    {
        loc=i;
        for(int j=i+1;j<n;j++)
        {
            if(Arr[j]<Arr[loc])
            {
                loc=j;
            }
        }
        temp =Arr[i];
        Arr[i]=Arr[loc];
        Arr[loc]=temp;
    }
    System.out.println("After sorting:");
    for(int i=0;i<n;i++)
    {
        System.out.println(Arr[i]);
    }
  }
}