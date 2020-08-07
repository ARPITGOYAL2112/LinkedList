public class Main
{
    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        list.push(1);
        list.push(2);
        list.push(5);
        list.push(3);
        list.push(7);
        list.push(4);
        list.push(10);
        list.oddeven();
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
    public void push(int x)
    {
        Node node=new Node();
        node.data=x;
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
    public void oddeven()
    {
        Node n=head,evenstart=null,evenend=null;
        Node oddstart=null,oddend=null;
        while(n!=null)
        {
            int ele=n.data;
            if(ele%2==0)
            {
                if(evenstart==null)
                {
                    evenstart=n;
                    evenend=evenstart;
                }
                else{
                    evenend.next=n;
                    evenend=evenend.next;
                }
            }
            else
            {
             if(oddstart==null)
                {
                    oddstart=n;
                    oddend=oddstart;
                }
                else{
                    oddend.next=n;
                    oddend=oddend.next;
                }
            }
            n=n.next;
        }
        if(oddstart == null || evenstart == null) { 
            return; 
        }        
        evenend.next=oddstart;
        oddend.next=null;
        head=evenstart;
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
