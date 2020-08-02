public class Main
{
	public static void main(String[] args) {
	    LinkedList list=new LinkedList();
	    list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.count();
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

    public void count()
    {
        Node n=head;
        int c=0;
        while(n!=null)
        {
            c++;
            n=n.next;
        }
        System.out.println("Elements in LinkedList = "+c);
        
    }
}
