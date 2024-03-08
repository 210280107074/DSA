import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

class p3005_leetcode{
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        int max = Collections.max(set);
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() == max){
                    count++;
                }
            }
        return count*max;
        
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        // System.out.println(maxFrequencyElements(arr));
        System.out.println(5/2);
    }
}