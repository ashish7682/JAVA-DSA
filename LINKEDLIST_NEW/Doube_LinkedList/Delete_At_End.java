//.............................Double Linked List.........................
import java.util.*;

//...............................structure of linked list..............................
public class Delete_At_End
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
        head.prev=newNode;
       newNode.next=head;
       head=newNode;
      // tail.next=head;
     }

     System.out.print("Do u want to add more data if yes press 1: ");
     n=ref.nextInt();

    }
    while(n==1);
}

//.....................Delete (last Element Form list) Method.....................
public void Delete()
{
    Node temp=tail;
    temp=temp.prev;
    temp.next=null;
    tail=null;
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
    Delete_At_End de=new Delete_At_End();
    de.Creation();
    de.Delete();
    de.traverse();
}
}