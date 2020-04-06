import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-04-10
 */
public class ReverseWords {
    public static String reverseWords(String s) {

        Stack<String> stack = new Stack<>();


        List<String> list = Arrays.asList(s.split(" "));

        list = list.stream().filter(r -> !r.equals("")).collect(Collectors.toList());

        for (String entry : list) {
            stack.push(entry.trim());
        }

        StringBuilder res = new StringBuilder();

        while (!stack.empty()) {
            res.append(stack.pop()).append(" ");
        }

        return res.toString().trim();

    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
