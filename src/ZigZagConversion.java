
public class ZigZagConversion {
	 public static void main(String[] args) {
		 System.out.println(convert("AB", 1));
	}
	public static String convert(String s, int numRows) {
	 	 if(numRows==1)
	 	 	return s;
         char[] chars=s.toCharArray();
         char[][] res=new char[numRows][s.length()];
         int j=0;
         int k=0;
         boolean jf=true;
         boolean kf=false;
         for(int i=0;i<chars.length;i++){
         	if(j<numRows&&jf){
				res[j][k]=chars[i];
         		if(j==numRows-1){
         			jf=false;
         			kf=true;
         			j--;
				}
				j++;
			}
			else if(j>=0&&kf){
				k++;
				j--;
				res[j][k]=chars[i];
         		if(j==0){
					jf=true;
					kf=false;
					j++;
				}

			}
		 }
		 String result="";
		 for (int i=0;i<numRows;i++){
			for(int r=0;r<s.length();r++){
				if(res[i][r]!='\u0000'){
					result+=res[i][r];
				}

			}
		}
		return result;
	}

}