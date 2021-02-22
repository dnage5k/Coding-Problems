package linkedlist;
import datastructure.ListNode;
public class RemoveDupSortedList83 {

	/*
	 * Purpose
	 * The purpose of this problem is remove any duplicates in the sorted linked list
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode curr = head;
		curr.next = new ListNode(1);
		curr = curr.next;
		curr.next = new ListNode(2);
		curr = curr.next;

	}
	
	/*
	 * Method:
	 * Create a new linked list to return
	 * Iterate through the input linked list until its null
	 * if the current value of the new linked list is not equal to the next head value then we link that value
	 * iterate to the next head
	 */
	 public static ListNode deleteDuplicates(ListNode head) {
	        if(head == null){
	            return null;
	        }
	        
	        ListNode newNode = new ListNode(head.val);
	        ListNode curr = newNode;
	        head = head.next;
	        
	        while(head != null){
	            if(curr.val != head.val){
	                curr.next = new ListNode(head.val);
	                curr = curr.next;
	            }
	            head = head.next;
	        }
	        
	        return newNode;
	    }

}
