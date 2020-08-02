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
	    list.swap(50,20);
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

    public void swap(int x,int y)
    {
        Node currX=head,prevX=null;
        Node currY=head,prevY=null;
        if(x==y)
        {
            return;
        }
        while(currX!=null && x!=currX.data)
        {
            prevX=currX;
            currX=currX.next;
        }
        while(currY!=null && y!=currY.data)
        {
            prevY=currY;
            currY=currY.next;
        }
        if(currY==null || currX==null)
        {
            System.out.println("x or y is not present in list.");
            return;
        }
        if(prevX!=null)
        {
            prevX.next=currY;
        }
        else
        {
            head=currY;
        }
        if(prevY!=null)
        {
            prevY.next=currX;
        }
        else
        {
            head=currX;
            
        }
               Node temp = currX.next; 
        currX.next = currY.next; 
        currY.next = temp; 
    }
    public void show()
    {
        Node n=head;
        System.out.println("After swapping");
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }
    
}
