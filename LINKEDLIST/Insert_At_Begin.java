class Insert_At_Begin
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
        Node currNode=head;
        if(currNode==null)
        {
            System.out.println("Empty node");
            return;
        }
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        Insert_At_Begin ab=new Insert_At_Begin();
        ab.addFirst("a");
       ab.addFirst("is");
       ab.addFirst("List");
        ab.print();
    }
}