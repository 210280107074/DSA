import java.util.Map.Entry;
import java.util.TreeMap;

public class p1122_leetcode{
     public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        int idx = 0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<map.get(arr2[i]);j++){
                arr1[idx] = arr2[i];
                idx++;
            }
            map.remove(arr2[i]);
        }
        int rest = idx;
        for (Entry<Integer, Integer> entry : map.entrySet()){
            for(int i=0;i<entry.getValue();i++){
                arr1[rest] = entry.getKey();
                System.out.println(arr1[rest]);
                rest++;
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        relativeSortArray(arr1, arr2);
    }
}