class Node{
    int data;
    Node next;
}
public class Main
{
	public static void main(String[] args) {
		Linkedlist list=new Linkedlist();
		list.insert(5);
		list.insert(10);
		list.insert(20);
		list.insertAt(2,15);
		list.show();
	}
}
class Linkedlist
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
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void insertAt(int z,int data)
    {
        Node node=new Node();
        node.data=data;
        Node n=head;
        if(z==0)
        {
            node.next=head;
            head=node;
        }
        else
        {
            while(z>1)
            {
                n=n.next;
                z--;
            }
            node.next=n.next;
            n.next=node;
            
        }
        
    }
    public void show()
    {
        Node n=head;
        while(n.next!=null)
        {
            System.out.println(n.data);
            n=n.next;
            
        }
        System.out.println(n.data);
        
        
    }
}

