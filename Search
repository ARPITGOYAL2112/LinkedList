public class Main
{
	public static void main(String[] args) {
	    LinkedList list=new LinkedList();
	    list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.search(40);
	    //list.show();
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

    public void search(int e)
    {
        int z=-1;
        Node n=head;
        int flag=0,count=1;;
        while(n.next!=null)
        {
            count++;
            n=n.next;
        }
        n=head;
        while(count>0)
        {
            z++;
            if(n.data==e)
            {
                flag=1;
                break;
            }
            n=n.next;
            count--;
        }
        if(flag==1)
        {
            System.out.println("Element found = " + n.data +" at index " + z);
        }else{
            System.out.println("Element not found");
        }
    }
}
