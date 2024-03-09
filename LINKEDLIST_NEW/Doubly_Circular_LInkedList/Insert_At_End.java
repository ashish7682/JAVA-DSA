import java.util.*;

class Insert_At_End
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
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        tail.next=head;
        head.prev=tail;
     }

     System.out.print("Do u want to add more data if yes press 1: ");
     n=ref.nextInt();

    }
    while(n==1);
}

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
    Insert_At_End ie=new Insert_At_End();
    ie.Creation();
    ie.traverse();
}
}