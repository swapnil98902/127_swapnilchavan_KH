import java.util.*;
public class ReverseLinkedList
{
	static class SinglyLinkedListNode
	{
		public int data;
		public SinglyLinkedListNode next;
		
		public SinglyLinkedListNode(int nodeData)
		{
			this.data=nodeData;
			this.next=null;
		}
	}
	static class SinglyLinkedList
	{
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;
	}
	public void insertNode(int nodeData)
	{
		SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
		 if(this.head == null)
		 {
			 this.head = node;
		 }
		 else
		 {
			 this.tail.next = node;
		 }
		 this.tail = node;
	}
}

public static void printSinglyLinkedList(SinglyLinkedListNode node, Sting sep, BufferedWriter bufferedWriter)
throws IOException
{
	while(node!=null)
	{
		bufferedWriter.write(String.valueOf(node.data));
		node = node.next;
		if(node!=null)
		{
			bufferedWriter.write(sep);
		}
	}
}
static SinglyLinkedListNode reverse(SinglyLinkedListNode head)
{
	SinglyLinkedListNode t =head;
	Stack<Integer> x = new Stack<>();
	while(t!=null)
	{
		x.push(t.data);
		t=t.next;
	}
	t=head;
	while(t!=null)
	{
		t.data=x.pop();
		t=t.next;
	}
	return head;
}
private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args)
throws IOException
{
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("output_path")));
	int tests = Scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	for (int testsltr = 0; testsltr<tests; testslte++)
	{
		SinglyLinkedList llist = new SinglyLinkedList();
		int llistCount = Scanner.nextInt();
		Scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		llist insertNode(llistitem);
	}
	SinglyLinkedListNode llist1 = reverse(llist.head);
	printSinglyLinkedList(llist1," ",bufferedWriter);
	bufferedWriter.newLine();
}
bufferedWriter.close();
scanner.close();
}
}
	
		