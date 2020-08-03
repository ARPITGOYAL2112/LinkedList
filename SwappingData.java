public class Main
{
	public static void main(String[] args) {
	    LinkedList list=new LinkedList();
	    list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.insert(50);
	    list.insert(60);
	    list.swap();
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

    public void swap() {
        Node node=head;
        while(node!=null && node.next!=null)
        {
            int k=node.data;
            node.data=node.next.data;
            node.next.data=k;
            node=node.next.next;
            
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
