import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        int i = 0;
        while(i<citations.length && citations[citations.length-1-i]>i){
            i++;
        }
        return i;

    }

    public static void main(String[] args) {
        System.out.println(new HIndex().hIndex(new int[]{}));
    }

}
