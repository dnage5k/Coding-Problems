package LeetCode;
import datastructure.ListNode;
public class MergeTwoSortedLists21 {

	/*Notes for main function
	 * I imported a made already Node class that implements Nodes and the value its containing
	 * I created two heads, head1 and head 2 and instantiated with values already
	 * created l1 and l2 so we can store more values into both head1 and head2 as a linked list
	 * 
	 * L1.next = one2 stores the value of the new list node created
	 * l1 = l1.next points l1 to the next location and its the same for l2
	 */
	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(1);
		ListNode l1 = head1;
		ListNode l2 = head2;
		
		
		ListNode one2 = new ListNode(2);
		ListNode one3 = new ListNode(4);

		ListNode two2 = new ListNode(3);
		ListNode two3 = new ListNode(4);
		
		l1.next = one2;
		l1 = l1.next;
		l1.next = one3;
		
		
		l2.next = two2;
		l2 = l2.next;
		l2.next = two3;
		

//		while(head1 != null) {
//			System.out.println(head1.val);
//			head1 = head1.next;
//		}
		
		System.out.println(sol(head1, head2));
		

	}
	/* Purpose
	 * The purpose of this problem is merge two sorted linked list into
	 */
	/* method
	 * have a if statements to cover cases where l1 or l2 is null and return the one that isnt null or 
	 * return null when l1 and l2 is null
	 * Create a head node to return and then set that equal to a node to go add on to.
	 * 
	 * Iterate until both l1 and l2 are null
	 * if l1 equals to null then we store l2 values
	 * if l2 is null then we store l1 values
	 * else we will check if l1 is less than l2 and we store that value
	 * if both l1 and l2 are not null then we point the main linked list to a new node to be assign
	 */
	public static ListNode sol(ListNode l1, ListNode l2) {
		 if(l1 == null && l2 == null){
	            return null;
	        }else if(l1 == null){
	            return l2;
	        }else if(l2 == null){
	            return l1;
	        }
		ListNode head = new ListNode();
        ListNode curr = head;
        while(l1 != null || l2 != null){
            if(l1 == null){
                curr.val = l2.val;
                l2 = l2.next;
                
            }else if( l2 == null){
                curr.val = l1.val;
                l1 = l1.next;
            }else{
                if(l1.val < l2.val){
                    curr.val = l1.val;
                    l1 = l1.next;
                }else{
                    curr.val = l2.val;
                    l2 = l2.next;
                }   
            }
            
            if(l1 != null || l2 != null){
                curr.next = new ListNode();
                curr = curr.next;
            }
            
        }
        
        return head;
	}

}
