package swordOffer;

public class 替换空格 {
    public static String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i =0 ; i<arr.length ;i++){
            if(arr[i]==' '){
                res.append("%20");
            }else{
                res.append(arr[i]);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("asd asd ewq "));
    }
}
