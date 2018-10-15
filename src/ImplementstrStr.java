
public class ImplementstrStr {
	public static int strStr(String haystack, String needle) {
		if(needle.equals("")) return 0;
		if(haystack.length()<needle.length())
			return -1;
		if(haystack.equals(needle))
			return 0;
		for(int i=0;i<haystack.length()-needle.length()+1;i++)
		{
			int temp=i;
			int j=0;
			while(haystack.codePointAt(i)==needle.charAt(j)){
				i++;
				j++;
				if(j==needle.length())
					return temp;
			}
			i=temp;
		}
		return -1;
    }
	
	public static void main(String[] args) {
		System.out.println(strStr("lslslllo", "lo"));
	}

}
