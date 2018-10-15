

public class RemoveNthNodeFromEndofList {

	public static void main(String[] args) {
		

	}

}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}
     
class Solution19{
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	 if(head == null || head.next == null)
             return null;
    	ListNode p1=head,p2=head,p =head;
    	for(int i=0;i<n;i++){
    		p2=p2.next;
    	}
    	if(p2==null){
    		head=head.next;
    		return head;
    	}else{
    	while(p2!=null){
    		p=p1;
    		p1=p1.next;
    		p2=p2.next;
    	}
    	p.next=p1.next;
    	}
		return head;
        
    }
}
