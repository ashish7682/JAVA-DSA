import java.util.*;
class Demo
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

    Node head=null;

    public void Creation()
    {
        int data,n;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("Enter data:");
            data=sc.nextInt();
        

        Node newNode=new Node(data);
        
        if(head==null)
        {
            head=newNode;
        }else
        {
            newNode.next=head;
            head=newNode;
        }
        System.out.println("Do u want add more data if yes press 1: ");
        n=sc.nextInt();
      }
      while(n==1);

    }

    public void traverse()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("Linked does not exit");
        }
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
        System.out.println("null");
    }
        //..........................Main method.............................
        public static void main(String args[])
        {
            Demo si=new Demo();
            si.Creation();
            si.traverse();
        }
    
}