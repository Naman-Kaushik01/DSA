package linkedlist;

import linkedlist.LinkedList.Node;

public class LinkedListPalindrome {
	public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
           return true;
       }

       // 1. Find the middle of the linked list
       Node slow = head;
       Node fast = head;
       while (fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;
       }

       // 2. Reverse the second half of the linked list
       Node secondHalfHead = reverseList(slow);

       // 3. Compare the first half and the reversed second half
//       Node firstHalfHead = head;
//       while (secondHalfHead != null) {
//           if (firstHalfHead.val != secondHalfHead.val) {
//               return false;
//           }
//           firstHalfHead = firstHalfHead.next;
//           secondHalfHead = secondHalfHead.next;
//       }

       return true;
   }

   private Node reverseList(Node head) {
       Node prev = null;
       Node curr = head;
       Node next = null;

       while (curr != null) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }

       return prev;
       
   }
	
	
	public static void main(String[] args) {
		LinkedList l2= new LinkedList();
		l2.AddLast(1);
		l2.AddLast(2);
		l2.AddLast(3);
		l2.AddLast(2);
		l2.AddLast(1);
		System.out.println();
		l2.PrintLL();
		
		
	}

}
