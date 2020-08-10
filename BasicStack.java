
public class Main {
	 public static void main(String args[])
	 {
		 Stack1 s=new Stack1();
		 s.push(5);
		 s.push(10);
		 s.push(20);
		 s.push(50);
		 s.push(60);
		 s.push(70);
		 s.pop();
		 s.pop();
		 s.pop();
		 s.pop();
		 s.pop();
		 s.pop();
	 }

}

class Stack1 {
	int size=5;
	int a[]=new int[size];
	int top=-1;
	void push(int x)
	{
		if(top>=size-1)
		{
			System.out.println("Stack Overflow ");
		}
		else
		{
			a[++top]=x;
		}
	}
	void pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			System.out.println(a[top]);
			top=top-1;
		}
	}

}
