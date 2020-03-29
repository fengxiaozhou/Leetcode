package Weekly.Contest182;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-29
 */
public class UndergroundSystem {

    Map<Integer, Entry> train;

    Map<String, Count> averageMap;

    public UndergroundSystem() {

        train = new HashMap<>();

        averageMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {

        Entry entry = new Entry(id, stationName, t);
        train.put(id, entry);

    }

    public void checkOut(int id, String stationName, int t) {

        Entry entry = train.get(id);

        String startEnd = entry.stationName+stationName;

        if (averageMap.containsKey(startEnd)) {

            double temp = averageMap.get(startEnd).avg;

            int count = averageMap.get(startEnd).count;

            temp = (temp * count + t - entry.t) / (double) (count + 1);

            averageMap.put(startEnd, new Count(count + 1, temp));

        } else {
            averageMap.put(startEnd, new Count(1, t - entry.t));
        }

        train.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {

        String startEnd = startStation+endStation;

        return averageMap.get(startEnd).avg;

    }

    class Entry {
        int id;
        String stationName;
        int t;

        public Entry(int id, String stationName, int t) {
            this.id = id;
            this.stationName = stationName;
            this.t = t;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStationName() {
            return stationName;
        }

        public void setStationName(String stationName) {
            this.stationName = stationName;
        }

        public int getT() {
            return t;
        }

        public void setT(int t) {
            this.t = t;
        }
    }

    class Count {
        int count;
        double avg;

        public Count(int count, double avg) {
            this.count = count;
            this.avg = avg;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getAvg() {
            return avg;
        }

        public void setAvg(double avg) {
            this.avg = avg;
        }
    }

    public static void main(String[] args) {

        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge"));
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));
        undergroundSystem.checkIn(10, "Leyton", 24);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));
        undergroundSystem.checkOut(10, "Waterloo", 38);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));

    }


}
