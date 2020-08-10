
class Stack {
	int max=10;
	int arr[]=new int[10];
	int top=0;
	int n=max;
	void push1(int x)
	{
		if(top>=max/2)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			arr[top]=x;
			top++;
		}
	}
	void push2(int x)
	{
		if(n<max/2)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			n--;
			arr[n]=x;
		}
	}
	void pop1()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			top--;
			System.out.println(arr[top]);
        }
	}
	void pop2()
	{
		if(n>=max)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println(arr[n]);
		    n++;
		}
	}

}

public class Main {
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push1(10);
		s.push1(10);
		s.push1(10);
		s.push1(10);
		s.push1(10);
		s.push1(10);
		s.push2(20);
		s.push2(20);
		s.push2(20);
		s.push2(20);
		s.push2(20);
		s.pop1();
		s.pop1();
		s.pop2();
		s.pop2();
		s.pop2();
		s.pop2();
		s.pop2();
		s.pop2();
		
	}
}
