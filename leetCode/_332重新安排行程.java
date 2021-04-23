import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class _332重新安排行程 {

    //<出发机场，<目的机场，是否到达过>>
    Map<String, Map<String, Boolean>> map;
    LinkedList<String> path;
    int target;

    @Test
    public void test() {
        List<List<String>> t = new ArrayList<List<String>>() {{
            add(new ArrayList<String>() {{add("JFK");add("KUL");}});
            add(new ArrayList<String>() {{add("JFK");add("NRT");}});
            add(new ArrayList<String>() {{add("NRT");add("JFK");}});
        }};
        findItinerary(t);
    }

    public List<String> findItinerary(List<List<String>> tickets) {
        path = new LinkedList<>();
        if (tickets == null || tickets.size() < 1) return path;
        target = tickets.size() + 1;
        map = new HashMap<>();
        for (List<String> list : tickets) {
            if (map.containsKey(list.get(0))) {//已经放进去了，需要添加新的目的机场
                map.get(list.get(0)).put(list.get(1), false);
            } else {
                map.put(list.get(0), new TreeMap<String, Boolean>() {{
                    put(list.get(1), false);
                }});
            }
        }
        path.add("JFK");
        backTracking(1);
        return path;
    }

    private boolean backTracking(int num) {
        if (num == target) {
            return true;
        }
        String key = path.peekLast();
        //在定义好的map里面去寻找
        Map<String, Boolean> find = map.get(key);
        for (Map.Entry<String, Boolean> entry : find.entrySet()) {
            //访问过了
            if (entry.getValue()) continue;
            path.add(entry.getKey());
            entry.setValue(true);
            if (backTracking(num + 1)) return true;
            path.removeLast();
            entry.setValue(false);
        }
        return false;
    }

/*    public void views(List<List<String>> tickets) {
        path = new ArrayList<String>();
        if (tickets == null || tickets.size() < 1) return;
        map = new HashMap<>();
        for (List<String> list : tickets) {
            if (map.containsKey(list.get(0))) {//已经放进去了，需要添加新的目的机场
                map.get(list.get(0)).put(list.get(1), false);
            } else {
                map.put(list.get(0), new HashMap<String, Boolean>() {{
                    put(list.get(1), false);
                }});
            }
        }
        System.out.println(map);
    }*/
}
