import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParentheses {

	public static void main(String[] args) {
		Solution22 s=new Solution22();
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        List res=s.G(a);
        for(int i=0;i<res.size()-2;i++){
            System.out.print(res.get(i)+",");
        }
        System.out.print(res.get(res.size()-1));

	}

}
class Solution22 {
    public List<String> G(int n) {
        List<String> res = new ArrayList<String>();
        helper(n, n, "", res);
        return res;
    }
    void helper(int left, int right, String out, List<String> res) {
        if (left < 0 || right < 0 || left > right) return;
        if (left == 0 && right == 0) {
            res.add(out);
            return;
        }
        helper(left - 1, right, out + "(", res);
        helper(left, right - 1, out + ")", res);
    }
}