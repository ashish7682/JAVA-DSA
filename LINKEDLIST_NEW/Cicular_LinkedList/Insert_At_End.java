import java.util.*;
//.............................Structure of Linked List.........................
class Insert_At_End
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

    //..................At the begining of program in linked list (head=null) & (tail=null)................

    Node head=null;
    Node tail=null;

    //......................Creation of circular Linked List.........................
    public  void Creation()
    {
    int data,n,m,p;
    Scanner ref=new Scanner(System.in);
    do
    {
      System.out.println("Enter data:");
      data=ref.nextInt();
      Node newNode=new Node(data);

      if(head==null)
      {
        head=newNode;
        tail=newNode;
        newNode.next=head;
      }
      else
      {
        tail.next=newNode;
        tail=newNode;
        newNode.next=head;
      }
      System.out.println("Do u want to add more data if yes press 1: ");
      n=ref.nextInt();
    }

    while(n==1);
    }

     //....................Traverse the condition.....................

     public void traverse()
     {
        Node temp=head;
        if(head==null)
        {
            System.out.print("Linked list does not exits");
        }
        else
        {
          do
          {
            System.out.print(temp.data+" ");
            temp=temp.next;
          }
          while(temp!=head);
        }
     }

     //...................Main method ............................

     public static void main(String args[])
     {
        Insert_At_End ie=new Insert_At_End();
        ie.Creation();
        ie.traverse();
     }
}
