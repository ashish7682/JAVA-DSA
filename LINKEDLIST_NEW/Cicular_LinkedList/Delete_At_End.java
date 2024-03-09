import java.util.*;
//.............................Structure of Linked List.........................
class Delete_At_End
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

    public void Delete()
    {
        int data,n;
        Scanner ref=new Scanner(System.in);
        do
        {
            if(head==null)
            {
                System.out.print("Linked list is empty");
            }
            else
            {
                Node temp=head;
                Node ptr=temp.next;
                while(ptr.next!=head)
                {
                    temp=ptr;
                    ptr=ptr.next;
                }
                temp.next=head;
                tail=temp;
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
        Delete_At_End de=new Delete_At_End();
      de.Creation();
      de.Delete();
      de.traverse();
     }
}
