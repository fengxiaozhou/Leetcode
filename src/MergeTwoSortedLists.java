import java.util.List;

import org.w3c.dom.ls.LSInput;

public class MergeTwoSortedLists {
	ListNode start=null,p;
	
	
	

}
class ListNode{
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=null,p1=null,p2=null,p3=null;
        if(l1==null)
        	return l2;
        if(l2==null)
        	return l1;
        p3=head;
        while(p1!=null||p2!=null){
        	if(p1.next==null){
        		head.next=p2;
                p2=p2.next;
                head=head.next;
        	}else if(p2.next==null){
        			head.next=p1;
        			p1=p1.next;
        			head=head.next;
        		}else if(p1.val<p2.val){
        				head.next=p1;
        				p1=p1.next;
        				head=head.next;
        			}else{
        				head.next=p2;
        				p2=p2.next;
        				head=head.next;
        				}
        }
        return p3.next;
    }
}

