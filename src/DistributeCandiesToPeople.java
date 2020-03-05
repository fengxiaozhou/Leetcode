import java.util.Arrays;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-05
 */
public class DistributeCandiesToPeople {

    public int[] distributeCandies(int candies, int num_people) {
        int [] res = new int[num_people];
        int num = 1;

        while (candies != 0){
            for(int i=0 ; i<num_people ;i++){
                if(candies<num){
                    res[i] = res[i]+candies;
                    candies = 0;
                }else{
                    res[i] = res[i]+num;
                    candies -= num;
                    num++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DistributeCandiesToPeople().distributeCandies(10, 3)));
    }
}
