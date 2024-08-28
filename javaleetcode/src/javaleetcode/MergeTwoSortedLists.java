package javaleetcode;
class ListNode{
	int val;
	ListNode next;
	public ListNode() {}
	public ListNode(int val) {
		this.val=val;
		
	}
	public ListNode(int val,ListNode next) {
		this.val=val;
		this.next=next;
	}
	
}

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
		ListNode dummy=new ListNode(-1);
		ListNode current=dummy;
		while (list1!=null&&list2!=null) {
			if(list1.val<=list2.val) {
				current.next=list1;
				list1=list1.next;
			}
			else {
				current.next=list2;
				list2=list2.next;
			}
			current=current.next;
			
		}
		if(list1!=null) {
			current.next=list1;
		}else if(list2!=null) {
			current.next=list2;
		}
		return dummy.next;
	}
	 public static void main(String[] args) {
	        // Create sample lists for testing
	        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
	        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
	        
	        // Create an instance of MergeTwoSortedLists
	        MergeTwoSortedLists solution = new MergeTwoSortedLists();
	        
	        // Merge the two lists
	        ListNode mergedList = solution.mergeTwoLists(list1, list2);
	        
	        // Print the merged list
	        printList(mergedList);
	    }
	    
	    // Helper method to print the linked list
	    public static void printList(ListNode node) {
	        while (node != null) {
	            System.out.print(node.val + " -> ");
	            node = node.next;
	        }
	        System.out.println("null");
	    }
}
