import org.junit.Test;

import java.util.*;

public class _207课程表 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses < 0 || prerequisites == null || prerequisites.length < 1) return true;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] t : prerequisites) {
            int study = t[0], preStudy = t[1];
            List<Integer> list = map.getOrDefault(study, new ArrayList<Integer>());
            list.add(preStudy);
            map.put(study, list);
        }
        int[][] preStudyMap = new int[numCourses][2];
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            preStudyMap[entry.getKey()][0] = entry.getValue().size();
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (preStudyMap[i][0] == 0) {
                queue.offer(i);
                preStudyMap[i][1] = 1;
            }
        }
        while (!queue.isEmpty()) {
            int isStudyed = queue.poll();
            numCourses--;
            for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                if (entry.getValue().contains(isStudyed)) {
                    preStudyMap[entry.getKey()][0]--;
                }
            }
            for (int i = 0; i < numCourses; i++) {
                if (preStudyMap[i][0] == 0 && preStudyMap[i][1] != 1) {
                    queue.offer(i);
                    preStudyMap[i][1] = 1;
                }
            }
        }
        return numCourses == 0;
    }

    @Test
    public void test() {
        int[][] prerequisites = {{1,0}};
        System.out.println(canFinish(2, prerequisites));
    }
}
