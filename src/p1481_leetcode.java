import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class p1481_leetcode{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[]{1};
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        System.out.println(list);
        int k = 1;
        while(list.size()>0 && k>=list.get(0)){
            k=k-list.get(0);
            list.remove(0);
        }
            System.out.println(list.size());
    }
}