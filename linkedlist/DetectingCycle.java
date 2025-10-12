package linkedlist;

import linkedlist.LinkedList.Node;

public class DetectingCycle {
	public Boolean HaveCycle(Node Head) {
		Node slow=Head;
		Node fast=Head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=Head.next;
			fast=Head.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	} 
	
	public static void main(String[] args) {
	
		
		
		
	}

}


