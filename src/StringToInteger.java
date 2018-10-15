
public class StringToInteger {

	public static void main(String[] args) {
		String a="   -12qwe3wer  ";
		System.out.println(myAtoi(a));


	}
	public static int myAtoi(String str){
		str=str.trim();
		if(str==null||str.length()==0)
			return 0;
		int l=str.length(),PandM=0,P=0,M=0;
		double res=0;
		for(int i=0;i<l;i++){
			if(str.charAt(i)=='+'||str.charAt(i)=='-'){
				PandM++;
				if(PandM==2)
					return 0;
				if(str.charAt(i)=='+')
					P++;
				else M++;
			}
			else if(str.charAt(i)<'0'||str.charAt(i)>'9')
				 break;
			     else{
			    	 if(M==0)
			    	 res=res*10+(int)(str.charAt(i)-'0');
			    	 else res=res*10-(int)(str.charAt(i)-'0');
			     }
		}
			if(res>Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if(res<Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
			return (int)res;
		
	}

}
