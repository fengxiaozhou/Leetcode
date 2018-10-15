import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		int res=0,left=0,right=0;
		HashSet<Character> t=new HashSet<>();
		while(right<s.length()){
			if(!t.contains(s.charAt(right))){
				t.add(s.charAt(right++));
				res=Math.max(res, t.size());
			}else{
				t.remove(s.charAt(left++));
			}
				
		}
		return res;
	}
	

}
