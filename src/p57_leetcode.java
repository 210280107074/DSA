import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

class  p57_leetcode{
    public static int[][] insert(int[][] intervals, int[] newInterval) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(newInterval[0]);
      list.add(newInterval[1]);
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<intervals.length;i++){
        map.put(intervals[i][0],intervals[i][1]);
      }
      int k = 0;
      System.out.println(map);
      for(int i=0;i<intervals.length;i++){
        if(newInterval[0]>intervals[i][0] && newInterval[0]<intervals[i+1][0]){
            list.add(intervals[i][0]);
            list.add(intervals[i][1]);
            k=i;
        }
      } 
      Collections.sort(list);
      intervals[k][0]=list.get(0);
          //   System.out.println(Collections.max(list));
      if(map.containsKey(Collections.max(list))){
         intervals[k][1]=map.get(Collections.max(list));
      } 
      else{ 
        intervals[k][1] = list.get(3);
      }
    if(map.containsKey(newInterval[1])){
        map.remove(newInterval[1]);
    }
  Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
  boolean flag = false;
while (iterator.hasNext()) {
    Map.Entry<Integer, Integer> entry = iterator.next();
    if (entry.getKey() == intervals[k][0]) {
        map.put(intervals[k][0], intervals[k][1]);
        flag = true;
    }
    if (entry.getValue() < intervals[k][1] && flag == true) {
        iterator.remove(); 
    }
}
System.out.println(map);
   List<int[]> combinedIntervals = new ArrayList<>();
        // Add intervals from the intervals array
        for (int[] interval : intervals) {
            combinedIntervals.add(interval);
        }
        // Add remaining entries from map to combinedIntervals
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            combinedIntervals.add(new int[]{entry.getKey(), entry.getValue()});
        }
       
    return intervals;
    }
    public static void main(String[] args) {
        int intervals[][] = new int[][]{{1,3},{6,9}};
        int newIntervals[] = new int[]{2,5};
        insert(intervals,newIntervals);
    }
}