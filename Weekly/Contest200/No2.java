package Weekly.Contest200;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Fz
 * @date 2020/8/2 10:54
 */
public class No2 {
    public int getWinner(int[] arr, int k) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        int max = Integer.MIN_VALUE;
        for (int i:arr) {
            max = Math.max(max,i);
            linkedList.add(i);
        }

        int count = 0;

        if(k<=arr.length){
            while(count<k){
                if(linkedList.get(1)<linkedList.get(0)){
                    putIndex1toLast(linkedList);
                    count++;
                    //把一放到最后，count++
                }else{
                    swap01(linkedList);
                    putIndex1toLast(linkedList);
                    count = 1;
                    //把一、0交换位置，把0放到最后，count=1
                }
            }
            return linkedList.get(0);
        }else{
            return max;
        }
    }

    private void swap01(LinkedList<Integer> linkedList){
        int temp = linkedList.get(1);
        linkedList.remove(1);
        linkedList.addFirst(temp);
    }

    private void putIndex1toLast(LinkedList<Integer> linkedList){
        int t = linkedList.get(1);
        linkedList.remove(1);
        linkedList.add(t);
    }

    public static void main(String[] args) {
        System.out.println(new No2().getWinner(new int[]{1,11,22,33,44,55,66,77,88,99}, 1000000000));
    }

}
