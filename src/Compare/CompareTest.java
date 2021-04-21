package Compare;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {

    public static void main(String[] args) {
        apple a1 = new apple(1);
        apple a2 = new apple(2);
        apple a3 = new apple(3);
        apple a4 = new apple(4);

        apple[] apples = new apple[]{a2,a3,a4,a1};
        System.out.println(Arrays.toString(apples));
        Arrays.sort(apples,(o1,o2)-> o1.size-o2.size);
        System.out.println(Arrays.toString(apples));
    }

    private int appComper(apple a1,apple a2){
        if(a1.size>a2.size){
            return 1;
        }else if(a1.size<a2.size){
            return -1;
        }else{
            return 0;
        }
    }
}

class apple implements Comparable {

    int size;

    public apple(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Object o) {
        apple a = (apple) o;
        if(this.size<a.size){
            return -1;
        }else if(this.size>a.size){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return ""+size;
    }
}
class appComper implements Comparator<apple>{

    @Override
    public int compare(apple o1, apple o2) {
        if(o1.size>o2.size){
            return 1;
        }else if(o1.size<o2.size){
            return -1;
        }else return 0;
    }
}