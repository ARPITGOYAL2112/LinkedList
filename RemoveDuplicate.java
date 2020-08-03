public class Main
{
	public static void main(String[] args) {
	    LinkedList list=new LinkedList();
	    list.insert(10);
	    list.insert(20);
	    list.insert(10);
	    list.insert(20);
	    list.insert(10);
	    list.insert(30);
	    list.removeDuplicate();
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
        node.next=null;public class Main
{
	public static void main(String[] args) {
	    LinkedList list=new LinkedList();
	    list.insert(10);
	    list.insert(20);
	    list.insert(10);
	    list.insert(20);
	    list.insert(10);
	    list.insert(30);
	    list.removeDuplicate();
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

    public void removeDuplicate() {
        Node ptr1=null,ptr2=null,dup=null;
        ptr1=head;
        while(ptr1.next!=null)
        {
            ptr2=ptr1;
            while(ptr2.next!=null)
            {
                if(ptr1.data==ptr2.next.data)
                {
                    dup=ptr2.next;
                    ptr2.next=dup.next;
                }
                else{
                    ptr2=ptr2.next;
                }
                
            }
            ptr1=ptr1.next;
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

    public void removeDuplicate() {
        Node ptr1=null,ptr2=null,dup=null;
        ptr1=head;
        while(ptr1.next!=null)
        {
            ptr2=ptr1;
            while(ptr2.next!=null)
            {
                if(ptr1.data==ptr2.next.data)
                {
                    dup=ptr2.next;
                    ptr2.next=dup.next;
                }
                else{
                    ptr2=ptr2.next;
                }
                
            }
            ptr1=ptr1.next;
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
