

public class ReverseInteger {

	public static void main(String[] args) {
		int a=0;
		a=reverse(30);
		System.out.println(a);

	}
    public static int reverse(int x) {
            int res = 0;
            while (x != 0) {
                int t = res * 10 + x % 10;
                if (t / 10 != res) return 0;
                res = t;
                x /= 10;
            }
            return res;
            
        
    }

}
