class Deletion_At_Begin
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
        Node newNode= new Node(data);
        //........Base Condition........
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
        if(current==null)
        {
            System.out.println("Empty Node");
            return ;
        }

        while(current!=null)
        {
            System.out.print(current.data+" ->");
            current=current.next;
        }

        System.out.println("null");
    
    }

    public void delete()
    {
        if(head==null)
        {
            System.out.println("The list is Empty");
            return;
        }
        head=head.next;
    }

    public static void main(String args[])
    {
        Deletion_At_Begin d=new Deletion_At_Begin();
        d.addFirst("Linked list");
        d.addFirst("a");
        d.addFirst("is");
        d.addFirst("This");
        d.print();
        d.delete();
        d.print();
    }


}