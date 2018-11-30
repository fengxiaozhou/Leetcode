/**
 * @author Fz
 * @date 2018/11/13 17:32
 */
public class LongPressedName {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("saeed","ssaaedd"));
    }
    public static boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length()){
            return false;
        }
        int len1=name.length();
        int len2=typed.length();
        int i=0;
        int j=0;
        while (i<len1&&j<len2){
            if(name.charAt(i)==typed.charAt(j)){
                j++;
            }else{
                i++;
            }
        }
        if(i==len1-1&&j==len2){
            return true;
        }
        return false;
    }
}
