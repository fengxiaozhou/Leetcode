/**
 * @author Fz
 * @date 2019/5/17 15:34
 */
public class Robot_Bounded_In_Circle {
    public boolean isRobotBounded(String instructions) {
        int x=0,y=0,i=0,d[][]={{0,1},{1,0},{0,-1},{-1,0}};
        for(int j=0;j<instructions.length();j++){
            if(instructions.charAt(j)=='G'){
                x=x+d[i][0];
                y=y+d[i][1];
            }
            if(instructions.charAt(j)=='L'){
                i=(i+3)%4;
            }
            if(instructions.charAt(j)=='R'){
                i=(i+1)%4;
            }
        }
        return x==0&&y==0 ||i>0;   //若回到原点则一定是自循环不需要考虑最后的朝向，若不能回到原点则需要判断朝向的位置，如果与起始位置一致则必定不能回到起始位置，不然会在3个回合之内回到原点
    }

    public static void main(String[] args) {
        System.out.println(new Robot_Bounded_In_Circle().isRobotBounded("GGLLGG"));
    }
}
