import org.omg.CORBA.MARSHAL;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-21
 */
public class WaterAndJugProblem {

    public boolean canMeasureWater(int x, int y, int z) {

        if (x + y < z) {
            return false;
        }
        if (x == 0 || y == 0) {

            return z == 0 || x + y == z;
        }
        return z % (gcd(x, y)) == 0;
    }

    private int gcd(int x, int y) {

        int max = Math.max(x, y);
        int min = Math.min(x, y);

        if (max % min != 0) {
            return gcd(min, max % min);
        } else {
            return min;
        }
    }

    public static void main(String[] args) {

        System.out.println(new WaterAndJugProblem().canMeasureWater(3,5,4));
    }

}
