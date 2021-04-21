package swordOffer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList();
        reverse(head,list);
        int[] arr = new int[list.size()];
        for(int i = 0 ; i < list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    private void reverse(ListNode node , List<Integer> list){
        if(node == null){
            return;
        }
        if(node.next == null){
            list.add(node.val);
            return;
        }
        reverse(node.next,list);
        list.add(node.val);
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);

        System.out.println(Arrays.toString(new 从尾到头打印链表().reversePrint(node)));

    }
}
