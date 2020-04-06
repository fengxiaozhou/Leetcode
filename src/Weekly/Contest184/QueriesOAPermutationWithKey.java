package Weekly.Contest184;

import java.util.*;

public class QueriesOAPermutationWithKey {

    public static int[] processQueries(int[] queries, int m) {

        List<Integer> res = new ArrayList<>();

        LinkedList<Integer> p = new LinkedList<>();
        for (int i = 1; i <= m; i++) {
            p.add(i);
        }

        for(int i :queries){
            res.add(p.indexOf(i));
            p.removeFirstOccurrence(i);
            p.addFirst(i);
        }

        int index = 0;
        int[] r = new int[res.size()];

        for(int i : res){
            r[index++] = i;
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(processQueries(new int[]{7,5,5,8,3}, 8)));
    }

}
