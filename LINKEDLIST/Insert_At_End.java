class Insert_At_End
{
    Node head;
     
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data)
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

    public void addEnd(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }

    public void print()
    {
        Node present=head;
        while(present!=null)
        {
            System.out.print(present.data+"->");
            present=present.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        Insert_At_End ie=new Insert_At_End();
        ie.addFirst("a");
        ie.addFirst("is");
        ie.addFirst("It");
        ie.print();
        ie.addEnd("Linked list");
        ie.print();        
    }

    
}