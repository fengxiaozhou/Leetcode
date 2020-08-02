package Weekly.Contest188;

public class No2 {
    public int countTriplets(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    int ij = xor(arr, i, j);
                    int jk = xorjk(arr, j, k);
                    if(ij == jk ){
                        count++;
                    }
                }
            }
        }
      return count;
    }

    private int xor(int[] arr, int a, int b) {

        int res = 0;
        for (int i = a; i < b; i++) {
            res ^= arr[i];
        }
        return res;
    }

    private int xorjk(int[] arr, int a, int b) {

        int res = 0;
        for (int i = a; i <= b; i++) {
            res ^= arr[i];
        }
        return res;
    }
}
