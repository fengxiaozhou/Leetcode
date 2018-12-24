import java.util.Calendar;
import java.util.Stack;

/**
 * @author Fz
 * @date 2018/12/17 16:36
 */
public class Minimum_Add_to_Make_Parentheses_Valid {
    public int minAddToMakeValid(String S) {
        if (S == null && S.length() == 0) return 0;
//        Stack<Character> stack = new Stack<>();//其实可以不用栈
        int num = 0;
        int extar=0;
        for (char c:S.toCharArray()) {
            if(c=='(') num++;
            else if(num!=0){
                   num--;
                 }else {
                extar++;
            }
        }
        return num+extar;
    }

    public static void main(String[] args) {
        System.out.println(new Minimum_Add_to_Make_Parentheses_Valid().minAddToMakeValid("()"));
    }
}
