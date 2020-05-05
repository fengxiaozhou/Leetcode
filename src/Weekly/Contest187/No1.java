package Weekly.Contest187;

import java.util.ArrayList;
import java.util.List;

public class No1 {
    public String destCity(List<List<String>> paths) {
        List<String> start = new ArrayList<>();
        List<String> end = new ArrayList<>();

        for (List<String> list : paths) {
            start.add(list.get(0));
            end.add(list.get(1));
        }

        String res = "";

        for (String s : end) {
            if(!start.contains(s)){
                res = s;
            }
        }
        return res;
    }
}
