import java.util.*;
//.............................Structure of Linked List.........................
class Insert_At_AnyPoint
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
      System.out.print("Enter data:");
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
         System.out.println("Enter position of node to be inserted..");
            p=ref.nextInt();
            Node temp=head;
            for(int i=0;i<(p-1);i++)
            {
              temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
      }
      System.out.print("Do u want to add more data if yes press 1: ");
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

     //...................Main method ............................

     public static void main(String args[])
     {
        Insert_At_AnyPoint ia=new Insert_At_AnyPoint();
      ia.Creation();
      ia.traverse();
     }
}
