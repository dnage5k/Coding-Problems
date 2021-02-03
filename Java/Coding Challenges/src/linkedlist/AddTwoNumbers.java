package linkedlist;
import datastructure.ListNode;
public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(9);
		ListNode head2 = new ListNode(9);
		ListNode l1 = new ListNode();
		l1 = head1;
		l1.next = new ListNode(5);
		ListNode l2 = new ListNode();
		l2 = head2;
//		l2.next = new ListNode(2);
		
		ListNode n = addTwoNumbers(l1,l2);
		while(n != null) {
			System.out.print(n.val + " ");
			n = n.next;
		}
//		System.out.println(addTwoNumbers(l1,l2));


	}
	
	
 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode curr = new ListNode();
        int carry = 0;
        curr = head;
        while(l1 != null || l2 != null){
            if(l1 == null){
            	if(l2.val + carry >= 10){
                    curr.val = (l2.val + carry) % 10;
                    carry = 1;
                }else{
                    curr.val = l2.val + carry;
                    carry = 0;
                }
            }else if(l2 == null){
            	if(l1.val + carry >= 10){
                    curr.val = (l1.val + carry) % 10;
                    carry = 1;
                }else{
                    curr.val = l1.val + carry;
                    carry = 0;
                }
            }else{
            	
                if(l1.val+l2.val+carry >= 10){
                	
                    curr.val = (l1.val+l2.val+carry) % 10;
                    carry = 1;
                }else{
                    curr.val = l1.val + l2.val + carry;
                    carry = 0;
                }
            }
            
            if(l1 == null && l2 != null){
                l2 = l2.next;
            }else if(l2 == null && l1 != null){
                l1 = l1.next;
            }else{
                l1 = l1.next;
                l2 = l2.next;
            }

            
            if(l1 == null && l2 == null && carry == 1){
                curr.next = new ListNode(carry);
                curr = curr.next;
                break;
            }else if(l1 != null || l2 != null){
                curr.next = new ListNode();
                curr = curr.next;
            }
            
 
        }
        
          return head;  
        }

}
