import java.util.Scanner;

public class RomantoInteger {

	public static void main(String[] args) {
		String s;
		Scanner sn=new Scanner(System.in);
		s=sn.nextLine();
		Solution A=new Solution();
		System.out.println(A.romanToInt(s));

	}
//    public static int romanToInt(String s) {
//        int res=chartonum(s.charAt(0));
//        
//        for(int i=1;i<s.length();i++){
//        	if(chartonum(s.charAt(i-1))<chartonum(s.charAt(i)))
//        		res=res+chartonum(s.charAt(i))-2*chartonum(s.charAt(i-1));
//        	else
//        		res+=chartonum(s.charAt(i));
//        }
//        return res;
//        
//    }
//    public static int chartonum(char c){
//    	int number=0;
//    	
//    	switch(c){
//    		case'I':
//    			number=1;
//    			break;
//    		case'V':
//    			number=5;
//    			break;
//    		case'X':
//    			number=10;
//    			break;
//    		case'L':
//    			number=50;
//    			break;
//    		case'C':
//    			number=100;
//    			break;
//    		case'D':
//    			number=500;
//    			break;
//    		case'M':
//    			number=1000;
//    			break;
//    	}
//    	return number;
//    	
//    }

}
//这个方法好!!很精彩

class Solution {
    public int romanToInt(String s) {
        int result = 0;
        if(s.indexOf("IV") > -1) {
            result -= 2;
        };  
        if (s.indexOf("IX") > -1) {
            result -= 2;
        };
        if (s.indexOf("XL") > -1) {
            result -= 20;
        };
        if (s.indexOf("XC") > -1) {
            result -= 20;
        };
        if (s.indexOf("CD") > -1) {
            result -= 200;
        };
        if (s.indexOf("CM") > -1) {
            result -= 200;
        };
        
        char[] Arr = s.toCharArray();
        
        for(int i = 0; i < Arr.length; i++) {
           if(Arr[i]=='M') result+=1000;
           if(Arr[i]=='D') result+=500;
           if(Arr[i]=='C') result+=100;
           if(Arr[i]=='L') result+=50;
           if(Arr[i]=='X') result+=10;
           if(Arr[i]=='V') result+=5;
           if(Arr[i]=='I') result+=1;
        }
        
        
        
        return result;
    }
}
