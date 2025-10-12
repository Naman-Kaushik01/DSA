package linkedlist;


public class ReverseLinkedList {
		
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
		
		public void AddLast(int data) {
			Node newNode = new Node(data);
			
			if(Head==null) {
				Head=tail=newNode;
			}
			tail.next=newNode;
			tail=newNode;
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
		
		public void reverse() {
			Node prev=null;
			Node curr=tail=Head;
			Node next;
			while(curr!=null) {
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;	
			}
			Head=prev;
		}
	public static void main(String[] args) {
		
		ReverseLinkedList ll= new ReverseLinkedList();
		ll.AddLast(1);
		ll.AddLast(2);
		ll.AddLast(3);
		ll.AddLast(4);
		ll.AddLast(5);
		ll.AddLast(6);
		
		ll.PrintLL();
		
		ll.reverse();
		ll.PrintLL();
		
		
	}

}
