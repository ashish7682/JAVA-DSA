import java.util.*;

class Stack 
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
}
Node top=null;

//.............................PUSH METHOD ..............................
 void push()
{
Scanner ref=new Scanner(System.in);
System.out.println("Enter data: ");
int data=ref.nextInt();
Node newNode=new Node(data);

 if(top==null)
 {
    top=newNode;
 }
 else{
    newNode.next=top;
    top=newNode;
 }
}

//.......................POP METHOD......................
 void pop()
{
    if(top==null)
    {
        System.out.println("Stack is empty");
    }
    else{
        top=top.next;
    }
}

//...........................DISPLAY METHOD.................

 void Display()
{
    Node temp=top;
    while(temp.data)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
}

//.........................MAIN METHOD.......................
public class Stack_LinkedList
{
    public static void main(String args[])
    {
        int d;
        Scanner ref=new Scanner(System.in);
        Stack s=new Stack();
        int p;

        do
        {
            System.out.println("press 1 to push");
            System.out.println("press 2 to pop ");
            System.out.println("press 3 to display");
            System.out println("Enter your search: ");

            d=ref.nextInt();
            switch(d)
            {
                case 1:
                    {
                        s.push(ref);
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
            System.out.println("Enter 0 to back to the main menu");
            System.out.println("Enter any to exits");
        }
        while(p==0);
        System.out.print("Exit successfully.....!");
    }
}