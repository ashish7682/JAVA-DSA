//.............................Double Linked List.........................
import java.util.*;

//...............................structure of linked list..............................
public class Insert_At_End
{
    static class Node
    {
        int data;
        Node next;
        Node prev;
        
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }


//.......................In the begin of circular linked list program (head=null) & (tail=null)................

Node head=null;
Node tail=null;

//........................Creation of Double linked list...............................

public void Creation()
{
    int data,n,m,p;
    Scanner ref=new Scanner(System.in);
    do
    {
     System.out.print("Enter data: ");
     data=ref.nextInt();
     Node newNode=new Node(data);
     if(head==null)
     {
        head=newNode;
        tail=newNode;
       // newNode.next=head;
     }
     else
     {
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
      // tail.next=head;
     }

     System.out.print("Do u want to add more data if yes press 1: ");
     n=ref.nextInt();

    }
    while(n==1);
}

//............................Traverse the condition..............................

public void traverse()
{
    Node temp=head;
    if(head==null)
    {
        System.out.println("Linked list does not exit");
    }
    else
    {
       while(temp!=null)
       {
        System.out.print(temp.data+" ");
        temp=temp.next;
       }
    }
    
}

//.........................Main Method.........................

public static void main(String args[])
{
    Insert_At_End cl=new Insert_At_End();
    cl.Creation();
    cl.traverse();
}
}