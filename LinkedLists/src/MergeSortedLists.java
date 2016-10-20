
public class MergeSortedLists {
	
	/*
	 * Merge two sorted lists. Added implementation in place.
	 */
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	public ListNode mergeInPlace(ListNode l1, ListNode l2) {
		ListNode head;
		ListNode curr1;
		ListNode curr2;
		if(l1.val < l2.val){
			head = l1;
			curr2 = l2;
		} else {
			head = l2;
			curr2 = l1;
		}
		curr1 = head;
		while(curr1 != null || curr2 != null){
			ListNode nextNode = curr1.next;
			if(curr1.next == null){
				curr1.next = curr2;
				break;
			}
			
			else {
				if(nextNode.val < curr2.val){
					curr1 = curr1.next;
				} else {
					curr1.next = curr2;
					curr1 = curr1.next;
					curr2 = nextNode;
				}
			}
			
		}
		return head;
		 
	}
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode head;
        
        if(curr1.val < curr2.val){
            head = new ListNode(curr1.val);
            curr1 = curr1.next;
        } else {
        	head = new ListNode(curr2.val);
            curr2 = curr2.next;
        }

        ListNode curr = head;
        
        while(curr1 != null || curr2 != null){
        	if(curr1 == null){
        		curr.next = new ListNode(curr2.val);
                curr2 = curr2.next;
                curr = curr.next;
        	}
        	else if(curr2 == null){
        		curr.next = new ListNode(curr1.val);
                curr1 = curr1.next;
                curr = curr.next;
        	}
        	else {
        		if(curr1.val < curr2.val){
                    curr.next = new ListNode(curr1.val);
                    curr1 = curr1.next;
                    curr = curr.next;
                } else {
                	curr.next = new ListNode(curr2.val);
                    curr2 = curr2.next;
                    curr = curr.next;
                }
        	}
            
     
        }
        return head;
    }
    
    public ListNode createList(int[] input){
    	ListNode head = new ListNode(input[0]);
    	ListNode curr = head;
    	for(int i = 1; i < input.length; i++){
    		ListNode newNode = new ListNode(input[i]);
    		curr.next = newNode;
    		curr = curr.next;
    	}
    	curr.next = null;
    	return head;
    }
    
    public void printList(ListNode head){
    	ListNode curr = head;
    	
    	while(curr != null){
    		System.out.print(curr.val);
    		System.out.print(" ");
    		curr = curr.next;
    	}
    	System.out.println();
    }
    
    public static void main(String[] args){
    	MergeSortedLists test = new MergeSortedLists();
    	int[] l1 = {2,3,4};
    	int[] l2 = {5,6,7,9,10};
    	ListNode head1 = test.createList(l1);
    	ListNode head2 = test.createList(l2);
    	
    	ListNode head = test.mergeInPlace(head1,head2);
    	test.printList(head);
    	
    	
    }
    
	   
}
