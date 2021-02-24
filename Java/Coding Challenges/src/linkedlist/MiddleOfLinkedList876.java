package linkedlist;
import datastructure.ListNode;
public class MiddleOfLinkedList876 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode curr = head;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(3);
		curr = curr.next;
		curr.next = new ListNode(4);
		curr = curr.next;
		curr.next = new ListNode(5);
		curr = curr.next;
		
		System.out.println(sol(head));

	}
	public static ListNode sol(ListNode head) {
		int count = 0;
		ListNode curr = head;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		
		curr = head;
		
		ListNode newNode = new ListNode();
		ListNode newCurr = newNode;
		int newCount = 0;
		while(curr != null) {
			if(count/2 <= newCount) {
				System.out.println(curr.val);
				newCurr.next = new ListNode(curr.val);
				newCurr = newCurr.next;
				
			}
			newCount++;
			curr = curr.next;
		}
		
		return newNode.next;
	}

}
