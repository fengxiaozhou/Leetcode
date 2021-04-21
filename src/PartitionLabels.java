import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public static List<Integer> partitionLabels(String S) {

        int[] last = new int[26];
        int length = S.length();
        for (int i = 0; i < length; i++) {
            last[S.charAt(i) - 'a'] = i;
        }

        char[] chars = S.toCharArray();

        Map<Character, Location> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.containsKey(c)) {
                map.get(c).end = i;
            } else {
                Location location = new Location();
                location.start = i;
                location.end = i;
                map.put(c, location);
            }
        }

        List<Location> list = new ArrayList<>();
        map.forEach((key, value) -> list.add(value));
        list.sort((o1, o2) -> {
            return o1.start - o2.start;
        });

        List<Integer> res = new ArrayList<>();

        int st = list.get(0).start;
        int end = list.get(0).end;

        for (int i = 1; i < list.size(); i++) {
            System.out.println(st + " " + end);
            Location l = list.get(i);
            if (l.start >= end) {
                res.add(end - st + 1);
                st = l.start;
            }
            if (end < l.end) {
                end = l.end;
            }
        }
        res.add(end - st + 1);
        return res;
    }

    static class Location {
        Integer start;
        Integer end;

        public Integer getStart() {
            return start;
        }

        public void setStart(Integer start) {
            this.start = start;
        }

        public Integer getEnd() {
            return end;
        }

        public void setEnd(Integer end) {
            this.end = end;
        }
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels("eccbbbbdec"));
    }
}
