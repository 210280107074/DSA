import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class p2610_leetcode {
     public int[][] findMatrix(int[] nums) {
        // int max_freq = 0;
        // int max_freq_num = 0;
        // HashMap<Integer,Integer> count = new HashMap<>();
        // int value  = 0;
        // for(int i=0;i<nums.length;i++){
        //     count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        // }

        // for(Entry<Integer, Integer> entry : count.entrySet()){
        //     if(entry.getValue() > max_freq){
        //         max_freq = entry.getValue();
        //         max_freq_num = entry.getKey();
        //     }
        // }
        Map<Integer, Integer> indexMap = new HashMap<>();

        // List of rows for the 2D array
        List<List<Integer>> rows = new ArrayList<>();

        for (int num : nums) {
            // Check if the number is already in the map
            if (indexMap.containsKey(num)) {
                // If yes, add it to the existing row
                int rowIndex = indexMap.get(num);
                rows.get(rowIndex).add(num);
            } else {
                // If not, create a new row and add the number to it
                List<Integer> newRow = new ArrayList<>();
                newRow.add(num);
                rows.add(newRow);

                // Update the map with the new index
                indexMap.put(num, rows.size() - 1);
            }
        }

        // Convert the list of lists to a 2D array
        int[][] result = new int[rows.size()][];
        for (int i = 0; i < rows.size(); i++) {
            List<Integer> rowList = rows.get(i);
            result[i] = new int[rowList.size()];
            for (int j = 0; j < rowList.size(); j++) {
                result[i][j] = rowList.get(j);
            }
        }

        return result;
               
        }
    
    public static void main(String[] args) {
        
    }
    
}
