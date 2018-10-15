import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsof_A_PhoneNumber {

	public static void main(String[] args) {
		Solution17 s=new Solution17();
		System.out.println(s.letterCombinations("1230956").toString());
		
	}

}
class Solution17 {
    private String[] letter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return result;
        }
        char[] curr = new char[digits.length()];
        helper(digits, result, curr, 0);
        return result;
    }
    
    private void helper(String digits, List<String> result, char[] curr, int level) {
        //base case
        if(level == digits.length()) {
            result.add(new String(curr));
            return;
        }
        
        //recursion rule
        String currStr = letter[digits.charAt(level) - '0'];
        if(currStr.length() == 0) {
            helper(digits, result, curr, level + 1);
        } else {
            for(int i = 0; i < currStr.length(); i++) {
                char currLetter = currStr.charAt(i);
                curr[level] = currLetter;
                helper(digits, result, curr, level + 1);
            }
        }
    }
}
