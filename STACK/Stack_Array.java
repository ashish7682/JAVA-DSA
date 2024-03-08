import java.util.*;
class Stack
{
    int top=-1;
   // Scanner ref=new Scanner(System.in);
   // System.out.print("enter size of array:");
   // int n=ref.nextInt();
   int n=10;
    int a[]=new int[n];


    //...........................Push Method..............................

    void push()
    {
        if(top==(n-1))
        {
            System.out.println("OverFlow Condition");
        }
        else
        {
            Scanner ref=new Scanner(System.in);
            System.out.println("Enter data:");
            int i=ref.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("Item inserted ");
        }
    }

    //............................Pop Method...............................

    void pop()
    {
       if(top==(-1))
       {
        System.out.println("Underflow");
       }
       else
       {
        top=top-1;
        System.out.println("Item deleted");
       }
    }

    //........................Display Method...........................

    void Display()
    {
        System.out.println("Items are :");
        for(int j=top;j>=0;j--)
        {
            System.out.print(a[j]+" ");
        }
    }
}

public class Stack_Array
{
    public static void main(String args[])
    {
        int d;
        Scanner ref=new Scanner(System.in);
        Stack s=new Stack();
        int p;
        do
        {
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("press 3 to display");
            System.out.print("Enter your Choice");
            

            d=ref.nextInt();

            switch(d)
            {
                case 1:
                {
                s.push();
                break;
                }

                case 2:
                {
                    s.pop();
                    break;
                }

                case 3:
                {
                     s.Display();
                     break;
                }
            }
            System.out.println("Enter 0 to go back to the main menu:");
            System.out.println("print any key to exist:");
           
                p=ref.nextInt();
            }
        
            while(p==0);
            System.out.println("Exit successfully...! ");
        }
 }
