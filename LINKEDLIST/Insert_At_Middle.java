class Insert_At_Middle
{
    Node head;

    class Node
    {
    Integer data;
    Node next;
    Node(Integer data)
    {
        this.data=data;
        this.next=null;
    }
    }

    public void addFirst(Integer data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
          head=newNode;
          return;  
        }
        newNode.next=head;
        head=newNode;
    }

    public void middle(Integer data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            newNode.next=head;
            head=newNode;
        }
        Node current=head;
        for(int i=0;i<1;i++)
        {
            current=current.next;
        }
            newNode.next=current.next;
            current.next=newNode;
        
    }

    public void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        Insert_At_Middle m=new Insert_At_Middle();
        m.addFirst(36);
        m.addFirst(56);
        m.addFirst(200);
        m.addFirst(90);
        m.print();
        m.middle(100);
        m.print();
    }
}