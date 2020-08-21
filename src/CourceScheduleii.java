import java.util.*;

public class CourceScheduleii {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] classNum = new int[numCourses];
        List<Integer> res = new ArrayList<>();

        for (int[] arr : prerequisites) {
            int caln = arr[0];  //需要有依赖的课
            classNum[caln]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < classNum.length; i++) {
            if (classNum[i] == 0) {
                queue.offer(i);
                res.add(i);
            }
        }

        while (queue.size() > 0) {
            int tclass = queue.poll();
            if(tclass == numCourses){
                res.add(numCourses);
                break;
            }else{
                for (int[] arr : prerequisites) {
                    if (arr[1] == tclass) {
                        classNum[arr[0]]--;
                        if (classNum[arr[0]] == 0) {
                            queue.offer(arr[0]);
                            res.add(arr[0]);
                        }
                    }
                }
            }
        }

        if (res.size() != numCourses) {
            return new int[0];
        } else {
            int[] r = new int[res.size()];
            for (int i = 0; i < res.size() ; i++) {
                r[i] = res.get(i);
            }
            return r;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CourceScheduleii().findOrder(2, new int[][]{{1, 0}})));
    }
}
