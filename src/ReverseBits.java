/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2021-03-29
 */
public class ReverseBits {
    public static int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);  //其中  n&1 为了得到最后一回   <<(31-i) 往左移动31-i位  rev = rev | num 将移动的首位展示
            n >>= 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 0b10011111;
        int k = 0b00000001;
        System.out.println(n&k);
//        int s = 0b10011111;
//        System.out.println(s>0);
//        for(int i = 0 ; i<8;i++){
//            n = n>>1;
//            s = s>>>1;
//            System.out.println(n>0);
//            System.out.println(s>0);
//        }

//        System.out.println(reverseBits(0b00000010100101000001111010011100));
    }
}
