package Weekly.Contest185;

import java.util.ArrayList;
import java.util.List;

public class No1 {
    public String reformat(String s) {
        List<Character> letter = new ArrayList<>();
        List<Character> num = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(c>='0' && c<='9'){
                num.add(c);
            }else{
                letter.add(c);
            }
        }
        StringBuilder res = new StringBuilder();
        if(Math.abs(letter.size()-num.size())>1){
            return "";
        }else{
            int max = Math.max(letter.size(),num.size());
            for(int i = 0 ; i<Math.max(letter.size(),num.size());i++){
                if(max == letter.size()){
                    if(i<letter.size()){
                        res.append(letter.get(i));
                    }
                    if(i<num.size()){
                        res.append(num.get(i));
                    }
                }else{
                    if(i<num.size()){
                        res.append(num.get(i));
                    }
                    if(i<letter.size()){
                        res.append(letter.get(i));
                    }
                }

            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No1().reformat("leetcode"));
    }
}
