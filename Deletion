public class Main
{
	public static void main(String[] args) {
	    LinkedList list=new LinkedList();
	    list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.delete(0);
	    list.show();
	}
}
class Node
{
    int data;
    Node next;
    
}
class LinkedList
{
    Node head;
    public void insert(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }else
        {
            Node n=head;
            while(n.next!=null)
            {
                //System.out.println(n.next);
                n=n.next;
            }
            n.next=node;
        }
    }
    public void delete(int n)
    {
        Node n1=head,n2;
        if(n>0)
        {
            while(n>1)
            {
                n1=n1.next;
                n--;
            }
            n2=n1.next;
            if(n2==null)
            {
                n1.next=null;
            }else
            n1.next=n2.next;
        }else
        {
            head=head.next;
        }
    }

    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}
