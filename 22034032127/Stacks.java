import java.util.*;
class twoStacks
{
	int y;
	int t1,t2;
	int arr[];
	
	twoStacks(int n)
	{
		y=n;
		arr = new int[n];
		t1 = n/2+1;
		t2 = n/2;
	}
	void push1(int x)
	{
		if(t1 > 0)
		{
			t1--;
			arr[t1] = x;
		}
		else
		{
			System.out.println("stack overflow" + " by element : " + x);
			return;
		}
	}
	void push2(int x)
	{
		if(t2 < y-1)
		{
			t2++;
			arr[t2] = x;
		}
		else
		{
			System.out.println("stack overflow" + "by element :" + x);
			return;
		}
	}
	int pop1()
	{
		if (t1 <= y/2)
		{
			int x = arr[t1];
			t1++;
			return x;
		}
		else
		{
			System.out.println("stack UnderFlow");
			System.exit(1);
		}
		return 0;
	}
	int pop2()
	{
		if(t2 >= y/2+1)
		{
			int x = arr[t2];
			t2--;
			return x;
		}
		else
		{
			System.out.println("stack UnderFlow");
			System.exit(1);
		}
	return 1;
	}
};

class Stacks
{
	public static void main(String[] args)
	{
		twoStacks ts = new twoStacks(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		ts.push2(40);
		System.out.println("popped element from stack1 is" + ": " + ts.pop1());
		System.out.println("popped element from stack1 is" + ": " + ts.pop2());
	}
}
			