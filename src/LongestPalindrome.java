public class LongestPalindrome {
	public static void main(String[] args){
		String a="asdasdasdabbaqwewer";
		String asd;
		asd=longestPalindrome(a);
		System.out.println(asd);
		
		
	}
	public static String longestPalindrome(String s) {
		int left,right;
		String res="";
		String a="";
		if(s==null||s.length()==0)
			return "0";
		for(int i=0;i<2*s.length()-1;i++){
			left=i/2;
			right=i/2;
			if(i%2==1) right++;
			a=ispalindrome(s,left,right);
			if(a.length()>res.length()){
				res=a;
			}
		}
		return res;
        
    }
	
	public static String ispalindrome(String s,int left,int right){
		String str="";
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
			str=s.substring(left, right+1);
			left--;
			right++;
		}
		
		return str;
	}
	
}

