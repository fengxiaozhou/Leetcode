import java.util.Objects;
import java.util.Stack;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-02
 */
public class ReverseLinkedListII {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre = new ListNode(0) ;
        pre.next = head;
        ListNode behind = head;
        Stack<Integer> stack = new Stack<>();
        ListNode index2 ;
        int i = 1;
        while (i<left){
            pre = pre.next;
            behind = behind.next;
            i++;
        }
        index2 = behind;
        while (i<=right){
            stack.push(index2.val);
            index2 = index2.next;
            i++;
        }
        while (!stack.empty()){
            pre.next = new ListNode(stack.pop());
            pre = pre.next;
        }
        pre.next  = index2;
        return head;
    }


    public static ListNode[] myReverse(ListNode head, ListNode tail) {
        ListNode prev = tail.next;
        ListNode p = head;
        while (prev != tail) {
            ListNode nex = p.next;
            p.next = prev;
            prev = p;
            p = nex;
        }
        return new ListNode[]{tail, head};
    }

    public static void main(String[] args) {
//        ListNode a = new ListNode(1);
//        a.next = new ListNode(2);
//        a.next.next = new ListNode(3);
//        a.next.next.next = new ListNode(4);
//        a.next.next.next.next= new ListNode(5);
//
//        ListNode[] listNodes = myReverse(a, a.next.next.next);
//        ListNode listNode = listNodes[0];
//        ListNode listNode1 = listNodes[1];
//        System.out.println(listNode);
//        System.out.println(listNode1);

        String s = "123234";
        System.out.println(Long.getLong("sun.arch.data.model"));
        System.out.println(Long.parseLong(s));
    }

    private static void print(ListNode a){
        while (Objects.nonNull(a)){
            System.out.println(a.val);
            a=a.next;
        }
    }
}
