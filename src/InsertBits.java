/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2021-03-30
 */
public class InsertBits {
    public static int insertBits(int N, int M, int i, int j) {
        String nBits = Integer.toBinaryString(N);
        String mBits = Integer.toBinaryString(M);
        int nlen = nBits.length();
        int mlen = mBits.length();
        if(nBits.length()<mBits.length()){
            return M;
        }else{
            char[] nChars =nBits.toCharArray();
            char[] mChars =mBits.toCharArray();
            int index = 0;
            while(i<=j){
                if(index<mlen){
                    nChars[nlen-1-i] = mChars[mlen-index-1];
                    index++;
                }else{
                    nChars[nlen-1-i] = 0;
                }
                i++;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (char c: nChars){
                stringBuilder.append(c);
            }
            return Integer.parseInt(stringBuilder.toString(),2);
        }
    }

    public static void main(String[] args) {
        System.out.println(insertBits(1143207437, 1017033, 11, 31));
    }
}



