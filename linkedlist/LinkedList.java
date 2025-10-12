package linkedlist;


public class LinkedList{
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	public static Node Head;
	public static Node tail;
	public static int size;
	
	public void AddFirst(int data) {
		Node newNode = new Node(data);
		size++;
		if(Head==null) {
			Head=tail=newNode;
			return;
		}
		newNode.next=Head;
		
		Head=newNode;
		
	}
	public void AddLast(int data) {
		Node newNode = new Node(data);
		size++;
		if(Head==null) {
			Head=tail=newNode;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	public void Add(int idx,int data) {
		if(idx==0) {
			AddFirst(data);
			return;
		}
		Node newNode= new Node(data);
		size++;
		Node temp=Head;
		int i=0;
		while(i<idx-1) {
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	public int RemoveFirst() {
		if(size==0) {
			return Integer.MAX_VALUE;
		}
		else if(size==1) {
			int val=Head.data;
			size=0;
			Head=tail=null;
			return val;
		}
		int val=Head.data;
		Head=Head.next;
		size--;
		return val;
	}
	
	public int RemoveLast () {
		
		if(size==0) {
			System.out.println("Linked List is empty.");
			return Integer.MIN_VALUE;
		}
		else if(size==1) {
			int val=Head.data;
			Head=tail=null;
			size=0;
			return val;
		}
		Node prev=Head;
		for(int i=0;i<size-2;i++) {
			prev=prev.next;
		}
		
		int val=prev.next.data;
		prev.next=null;
		tail=prev;
		size--;
		return val;
		
	}
	public int IterativeSearch(int key) {
		Node temp=Head;
		int i=0;
		while(temp!=null) {
			if(temp.data==key) {
				System.out.println("Key Found at "+i);
				return i;
			}
			temp=temp.next;
			i++;
			
		}
		return -1;
	}
	public void PrintLL() {
		Node temp=Head;
		if(Head==null) {
			System.out.println("LinkedList is empty");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.AddFirst(1);
		ll.AddFirst(2);
		ll.AddLast(3);
		ll.AddLast(4);
		ll.Add(2, 9);
		
		ll.PrintLL();
		ll.IterativeSearch(3);
		System.out.println(size);
		
	}

}
