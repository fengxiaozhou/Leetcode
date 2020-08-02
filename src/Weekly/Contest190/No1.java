package Weekly.Contest190;

import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No1 {
    public int isPrefixOfWord(String sentence, String searchWord) {

        List<String> arrayList = new ArrayList(Arrays.asList(sentence.split(" ")));
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new No1().isPrefixOfWord("i am tired", "you"));
    }
}
