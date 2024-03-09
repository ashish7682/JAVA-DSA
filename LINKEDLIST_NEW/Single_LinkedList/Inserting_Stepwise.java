import java.util.*;
class Inserting_Stepwise
{
   //.............Structure of linkedlist..................

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

    //.................At the begining of program head=null............
    
    Node head=null;
    
    //........................Creation of data............................
   
     public void Creation()
     {
        int data,n,p,m;
        Scanner sc=new Scanner(System.in);
        do 
        {
            System.out.print("Enter data:");
            data=sc.nextInt();
            Node newNode=new Node(data);

            if(head==null)
            {
             head=newNode;   
            }
            else
            {
             System.out.print("Enter 1 to insert the item at begining, Enter 2 to insert the item at end, Enter 3 to insert the item at any postion:");

              m=sc.nextInt();
              switch(m)
              {
                case 1:
                    newNode.next=head;
                    head=newNode;
                    break;

                case 2:
                    Node temp=head;
                    while(temp.next!=null)
                    {
                        temp=temp.next;
                    }
                    temp.next=newNode;
                    break;

                 case 3:

                     System.out.println("Enter postion of node to be inserted:");
                     p=sc.nextInt();
                     Node temp1=head;
                     for(int i=0;i<(p-1);i++)
                     {
                        temp1=temp1.next;
                     }
                     newNode.next=temp1.next;
                     temp1.next=newNode;
                     break;

              }                 
            }

            System.out.print("Do you want to add more data, if yes press 1:");
            n=sc.nextInt();
        }
        while(n==1);
     }

        //......................Travese the condition...................
    public void traverse()
    {
        Node  temp=head;
        if(head==null)
        {
            System.out.println("Linked does not exist");
        }
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.data+" ->");
                temp=temp.next;
            }
        }
        System.out.println("null");
    }

    //...................Main method........................
    public static void main(String args[])
    {
        Inserting_Stepwise si=new Inserting_Stepwise();
        si.Creation();
        si.traverse();
    }

}
