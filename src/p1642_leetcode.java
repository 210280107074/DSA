import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class p1642_leetcode {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < heights.length - 2; i++) { // Adjusted loop condition
            if (heights[i + 1] > heights[i]) {
                map.put(i, heights[i + 1] - heights[i]);
            } else {
                map.put(i, 0);
            }
        }
        System.out.println(map);
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<>(map.values());
        Collections.sort(temp);
        System.out.println(temp);
        int max = temp.get(temp.size()-1);
        for (int i = 0; i < heights.length-2; i++) { // Adjusted loop condition
        
            if (map.get(i) > 0) {
                if ((map.get(i)==max && ladders == 0 && bricks >= map.get(i)) || (map.get(i) != max && bricks >= map.get(i))) {
                    count++;
                    bricks -= map.get(i);
                } else if (ladders > 0) {
                    count++;
                    temp.remove(temp.size()-1);
                    max = temp.get(temp.size()-1);
                    ladders -= 1;
                } else {
                    break;
                }
            } else {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,5,1,2,3,4,10000};
        int bricks = 4;
        int ladders = 1;
        System.out.println(furthestBuilding(arr, bricks, ladders));
       
    }
}
