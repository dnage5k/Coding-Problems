package LeetCode;
import datastructure.ListNode;
public class MergeTwoSortedLists21 {

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
                System.out.println("checking");
                curr.val = l2.val;
                l2 = l2.next;
                
            }else if( l2 == null){
                curr.val = l1.val;
                l1 = l1.next;
            }else{
            	System.out.println(l1.val);
            	System.out.println(l2.val);
                if(l1.val < l2.val){
                     System.out.println("checking2");
                    curr.val = l1.val;
                    l1 = l1.next;
                }else{
                     System.out.println("checkingDFD");
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
