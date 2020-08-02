
public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome2(121));
	}
	public static boolean isPalindrome(int x) {
		int m,n,len=1;
		if(x<0)
			return false;
		if(x/10==0)
			return true;
		while(x/len>=10){
			len*=10;
		}	
		while(x>0){
			m=x/len;
			n=x%10;
			if(m!=n)
				return false;
			x=(x%len)/10;
			len=len/100;
		}
        return true;
    }

	public static boolean isPalindrome2(int x) {
		if(x<0)
			return false;
		char[] chars = String.valueOf(x).toCharArray();
		int start = 0;
		int end = chars.length-1;
		while(start<end){
			if(chars[start]!=chars[end]){
				return false;
			}else{
				start++;
				end--;
			}
		}
		return true;
	}
}
