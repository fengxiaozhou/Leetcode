package Weekly.Contest182;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-29
 */
public class countNumberOfTeams {

    public int numTeams(int[] rating) {

        int n = rating.length;

        if (rating.length < 3) {
            return 0;
        }

        int sum = 0 ;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(rating[i]<rating[j] && rating[j]<rating[k]){
                        sum++;
                    }
                    if(rating[i]>rating[j] && rating[j]>rating[k]){
                        sum++;
                    }
                }
            }
        }

        return sum;

    }
}
