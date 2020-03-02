import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-02
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(Objects.isNull(head)){
            return head;
        }
        if(Objects.isNull(head.next)){
            return head;
        }
        Stack s1  = new Stack();
        while (Objects.nonNull(head)){
            s1.push(head.val);
            head = head.next;
        }
        ListNode res = new ListNode(-1);
        ListNode RES = res;
        while (!s1.empty()){
            ListNode temp = new ListNode((int)s1.pop());
            res.next = temp;
            res = res.next;
        }
        return RES.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
//        a.next = new ListNode(2);
//        a.next.next = new ListNode(3);
//        a.next.next.next = new ListNode(4);
//        a.next.next.next.next= new ListNode(5);

        print(reverseList(a));




    }

    private static void print(ListNode a){
        while (Objects.nonNull(a)){
            System.out.println(a.val);
            a=a.next;
        }
    }
}
