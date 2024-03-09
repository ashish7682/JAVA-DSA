import java.util.*;
//.............................Structure of Linked List.........................
class Delete_At_Anypoint
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
         newNode.next=head;
         head=newNode;
         tail.next=head;
      }
      System.out.print("Do u want to add more data if yes press 1: ");
      n=ref.nextInt();
    }

    while(n==1);
    }
//...........................Delete the element form any point...................
    public void Delete()
    {
        int data,n,p;
        Scanner ref=new Scanner(System.in);
        do
        {
            if(head==null)
            {
                System.out.print("Linked list is empty");
            }
            else
            {
               System.out.println("Enter postion of node to be delete: ");
               p=ref.nextInt();
               Node temp=head;
               Node ptr=temp.next;
               for(int i=0;i<(p-1);i++)
               {
                temp=ptr;
                ptr=ptr.next;
               }
               temp.next=ptr.next;
            }
            System.out.println("Do u want to delete more data if yes press 1:");
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
        Delete_At_Anypoint da=new Delete_At_Anypoint();
      da.Creation();
      da.Delete();
      da.traverse();
     }
}
