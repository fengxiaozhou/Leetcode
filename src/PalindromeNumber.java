
public class PalindromeNumber {
	public static void main(String[] args) {
		String num = String.valueOf(123456);
		boolean flag=isPalindrome(121);
		System.out.println(num.charAt(2));
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

}
