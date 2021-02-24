package linkedlist;
import datastructure.ListNode;
public class MiddleOfLinkedList876 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode sol1(ListNode head) {
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
			if(count/2 < newCount) {
				newCurr = curr;
				newCurr.next = new ListNode();
				
			}
			newCount++;
			curr = curr.next;
		}
	}

}
