package linkedlist;
import datastructure.ListNode;
public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode head1 = new ListNode();
		ListNode head2 = new ListNode();
		ListNode l1 = new ListNode();
		ListNode l2 = new ListNode();
		int[] nums1 = {9,9,9,9,9,9,9};
		int[] nums2 = {9,9,9,9};
//		head.val = nums[0];
		l1 = head1;
		l2 = head2;
		int i = 0;
		while(i < nums1.length) {
			l1.val = nums1[i];
			l1.next = new ListNode();
			if(i == nums1.length-1) {
				break;
			}
			l1 = l1.next;
			i++;
			
		}
		int j = 0;
		while(j < nums2.length) {
			l2.val = nums2[j];
			l2.next = new ListNode();
			if(j == nums2.length-1) {
				break;
			}
			l2 = l2.next;
			j++;
		}
		while(head1 != null) {
			System.out.print(head1.val + "->");
			head1 = head1.next;
		}System.out.println("");
		while(head2 != null) {
			System.out.print(head2.val + "->");
			head2 = head2.next;
		}

	}
	
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        head.val = l1.val + l2.val;
        head = head.next;
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null || l2 != null){
            if(l1 == null){
                
            }else if(l2 == null){
                
            }else{
                head.val = l1.val + l2.val;
            }
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        return head;
    }

}
