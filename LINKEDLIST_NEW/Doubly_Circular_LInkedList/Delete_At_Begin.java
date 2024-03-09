import java.util.*;

class Delete_At_Begin
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

    Node head=null;
    Node tail=null;

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
        newNode.next=head;
        newNode.prev=tail;
     }
     else
     {
     newNode.next=head;
     head.prev=newNode;
     newNode.prev=tail;
     tail.next=newNode;
     head=newNode;
     }

     System.out.print("Do u want to add more data if yes press 1: ");
     n=ref.nextInt();

    }
    while(n==1);
}

//.................Delete Method........................
public void Delete()
{
    int data,n;
    Scanner ref=new Scanner(System.in);
    do
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
        }
        else
        {
            Node temp=head;
            temp=temp.next;
            head=temp;
            head.prev=tail;
            tail.next=head;
        }
        System.out.println("Do u want to delete more data if yes press 1:");
         n=ref.nextInt();
    }
        while(n==1);

    
}
//..........................Traverse method .......................
public void traverse()
{
    Node temp=head;
    if(head==null)
    {
        System.out.println("Linked list does not exit");
    }
    else
    {
        do
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        while(temp!=head);
    }
}

//.........................Main Method.........................

public static void main(String args[])
{
    Delete_At_Begin db=new Delete_At_Begin();
    db.Creation();
    db.Delete();
    db.traverse();
}
}

