public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder("");

        StringBuilder s2 = new StringBuilder("");

        while(l1!=null){
            s1.append(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            s2.append(l2.val);
            l2=l2.next;
        }

        System.out.println(Integer.parseInt(s1.toString()));
        System.out.println(Integer.parseInt(s2.toString()));
        Integer res = Integer.parseInt(s1.toString()) + Integer.parseInt(s2.toString());

        String s = String.valueOf(res);

        ListNode r = new ListNode(0);
        ListNode p = r;


        for(char c :s.toCharArray()){
            p.next = new ListNode(c-'0');
            p=p.next;
        }

        return r.next;

    }







}
