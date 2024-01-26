class Deletion_At_Middle
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

    public void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void delete()
    {
        Node present=head;
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        for(int i=0;i<1;i++)
        {
            present=present.next;
        }
        present.next=present.next.next;
    }

    public static void main(String args[])
    {
        Deletion_At_Middle d=new Deletion_At_Middle();
        d.addFirst("Linkedlist");
        d.addFirst("a");
        d.addFirst("This");
        //d.addFirst("")
        d.print();
        d.delete();
        d.print();
    }
}