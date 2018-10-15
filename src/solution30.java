import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class solution30 {
    public List<Integer> findSubstring(String S, String[] L) {  
        List<Integer> ans = new ArrayList<Integer>();  
        if (S.length() < 1 || L.length < 1) return ans;  
        int len = L[0].length(); //��Ŀ˵L��ÿ�����ʳ���һ��  
          
        //��ʼ��HashMap��ע��L�п��ܰ��������ͬ���ַ�����������value��ʾ����  
        HashMap<String, Integer> map = new HashMap<String, Integer>();  
        for (int j = 0; j < L.length; j++) {  
            if (map.containsKey(L[j])) {  
                map.put(L[j], map.get(L[j]) + 1);  
            } else {  
                map.put(L[j], 1);  
            }  
        }  
          
        //i�ķ�Χ�ܹؼ������ֱ�ӵ�S.length()�ǻᳬʱ��  
        for (int i = 0; i <= S.length() - L.length * len; i++) {  
            int from = i;  
            String str = S.substring(from, from + len);  
            int cnt = 0;  
            while (map.containsKey(str) && map.get(str) > 0) {  
                map.put(str, map.get(str) - 1);  
                cnt++;  
                from += len;  
                if (from + len > S.length()) break; //ע��Խ��  
                str = S.substring(from, from + len);  
            }  
              
            //L��ÿ������ǡ�ó���һ�Σ����뵽�����  
            if (cnt == L.length) {  
                ans.add(i);  
            }  
              
            //Ϊ��һ�γ�ʼ��HashMap  
            if (cnt > 0) {  
                map.clear();  
                for (int j = 0; j < L.length; j++) {  
                    if (map.containsKey(L[j])) {  
                        map.put(L[j], map.get(L[j]) + 1);  
                    } else {  
                        map.put(L[j], 1);  
                    }  
                }  
            }  
        }  
          
        return ans;  
    }  

}
