import java.util.*;
class Single_Inserting
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
        int data,n;
        Scanner sc=new Scanner(System.in);
        do
        {
        System.out.print("Enter data:");
        data=sc.nextInt();

        //..................Object create for Node..................

        Node newNode=new Node(data);//----------passing the data-------------

        //.............if Linklist does not exist..................
        if(head==null)
        {
            head=newNode;
        }else
        {
          newNode.next=head;
          head=newNode;
        }

         System.out.print("Do u want to add more data if yes press 1: ");
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
        Single_Inserting si=new Single_Inserting();
        si.Creation();
        si.traverse();
    }

}