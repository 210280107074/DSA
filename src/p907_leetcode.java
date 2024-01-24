import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p907_leetcode {
    public static int sumSubarrayMins(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
  int sum = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(arr[i]);
                }
                sum = sum + Collections.min(subarray);
                result.add(subarray);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
    
}
