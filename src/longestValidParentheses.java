
public class longestValidParentheses {

	public static void main(String[] args) {
		

	}
	
    public int longestValidParentheses(String s) {
        int count=0;
        char []arr=s.toCharArray();
        int len=s.length();
        if(len==0||s==null){
        	return 0;
        }
        int index=0;
        for(int i=0;i<len;i++){
        	if(arr[i]=='('){
        		index++;
        	}else{
        		index--;
        	}
        	
        	
        }
        return count;
    }
}
