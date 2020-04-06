package Weekly.Contest185;

import java.util.*;


public class No2 {

    public List<List<String>> displayTable(List<List<String>> orders) {

        TreeSet<String> menu = new TreeSet<>();
        TreeMap<Integer, Table> tableList = new TreeMap<>();
        for (List<String> l : orders) {
            int a = Integer.parseInt(l.get(1));
            menu.add(l.get(2));
            if (tableList.containsKey(a)) {
                Table temp = tableList.get(a);
                if (temp.map.containsKey(l.get(2))) {
                    temp.map.put(l.get(2), temp.map.get(l.get(2)) + 1);
                } else {
                    temp.map.put(l.get(2), 1);
                }
            } else {
                Table t = new Table();
                t.map.put(l.get(2), 1);
                tableList.put(a, t);
            }
        }

        List<List<String>> res = new ArrayList<>();
        List<String> mu = new ArrayList<>();
        mu.add("Table");
        mu.addAll(menu);
        res.add(mu);
        for (Map.Entry<Integer, Table> entry : tableList.entrySet()) {
            List temp = new ArrayList<>();
            temp.add(entry.getKey().toString());
            Map<String, Integer> map = entry.getValue().map;
            for(String s : menu){
                if(map.containsKey(s)){
                    temp.add(map.get(s).toString());
                }else{
                    temp.add("0");
                }
            }
            res.add(temp);
        }

        return res;
    }

    static class Table {
        Map<String, Integer> map;

        public Table() {
            this.map = new HashMap<>();
        }

        public Map<String, Integer> getMap() {
            return map;
        }

        public void setMap(Map<String, Integer> map) {
            this.map = map;
        }
    }

}
