package Sort;

public class SingleListQuickSort {
    void quickSort(Node start, Node end) {
        if (start != end) {
            Node pNode = partition(start, end);
            quickSort(start, pNode);
            quickSort(pNode.next, end);
        }
    }
    Node partition(Node start, Node end) {
        if (start == end)
            return start;
        Node pre = start;
        Node behind = start.next;
        int key = start.key;
        while (behind != end) {
            if (behind.key < key) {
                pre = pre.next;
                int temp = pre.key;
                pre.key = behind.key;
                behind.key = temp;
            }
            behind = behind.next;
        }
        int temp = start.key;
        start.key = pre.key;
        pre.key = temp;
        return pre;
    }
}
class Node
{
    public int key;
    public Node next;
    public Node(int k) {
        key = k;
        next = null;
    }
}