import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-02-06
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] tempArray = new int[26];
            StringBuilder key = new StringBuilder();

            for (int j = 0; j < str.length(); j++) {
                tempArray[str.charAt(j) - 'a']++;
            }

            for (int aTempArray : tempArray) {
                key.append("#").append(aTempArray);
            }

            if (map.containsKey(key.toString())) {
                map.get(key.toString()).add(str);
            } else {
                map.put(key.toString(), new ArrayList<>(Collections.singletonList(str)));
            }
        }

        return new ArrayList<>(map.values());

    }

    public List<List<String>> primeNumber(String[] strs) {

        Map<Long,List<String>> map = new HashMap<>();

        int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

        for (String str : strs) {
            Long sum = 1L;

            for (char c : str.toCharArray()) {
                sum = sum * prime[c - 'a'];
            }

            if (map.containsKey(sum)) {
                map.get(sum).add(str);
            } else {
                map.put(sum, new ArrayList<>(Collections.singletonList(str)));
            }
        }

        return new ArrayList<>(map.values());

    }


    public static void main(String[] args) {
        System.out.println(new GroupAnagrams().groupAnagrams(new String[] {"eat", "ate", "tan", "ate", "nat", "bat"}));
    }
}
