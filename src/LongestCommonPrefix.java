import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs=new String[]{"c","acc","ccc"};
		Solution1 A=new Solution1();
		String res=A.longestCommonPrefix(strs);
		System.out.println(res);
		
	}


}
class Solution1{
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0) return "";
		if(strs.length==1) return strs[0];
		Arrays.sort(strs);
		String res=strs[0];
		String end=strs[strs.length-1];
		int index=0;
		for(int i=0;i<Math.min(res.length(),end.length());i++){
			if(res.charAt(i)==end.charAt(i)){
						index++;
			}else
				break;
		}
					
		return res.substring(0, index);
        
    }
}