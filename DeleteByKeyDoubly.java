public class Main
{
    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        list.push(1);
        list.push(2);
        list.push(5);
        list.push(3);
        list.push(4);
        list.push(7);
        list.push(10);
        list.deleteByKey(4);
        list.show();
    }
}
class Node
{
    int data;
    Node next,prev;
}
class LinkedList
{
    Node head,tail;
    public void push(int x)
    {
        Node node=new Node();
        node.data=x;
        Node n=head;
        if(head==null)
        {
            head=tail=node;
            tail.next=null;
            head.prev=null;
        }
        else
        {
            tail.next=node;
            node.prev=tail;
            tail=node;
            tail.next=null;
        }

    }
    public void deleteByKey(int key)
    {
        Node prev=null,curr=head;
        if(curr.data==key)
        {
            head=curr.next;
            head.prev=null;
            return;
        }
        if(tail.data==key)
        {
            tail=tail.prev;
            tail.next=null;
            return;

        }
        while(curr.next!=null)
        {
            prev=curr;
            if(key==curr.next.data)
            {
                prev.next=curr.next.next;
                
                curr.next.prev=prev;
                
            }
            else
            curr=curr.next;
        }
    }

    public void show()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }
}
