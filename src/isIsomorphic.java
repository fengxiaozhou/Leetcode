import java.util.HashMap;
import java.util.Map;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2021-03-30
 */
public class isIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0 ;i <s.length();i++){
            if(s.charAt(i)==t.charAt(i)){
                i++;
                continue;
            }
            if(map.containsKey(s.charAt(i))){
                if(!map.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }
}
