import java.util.ArrayList;

public class GFG_find_Index_of_subarray_with_sum{
    public static ArrayList<Integer> solve(int[] arr,int s){
       int i=0;
       int j=0;
       ArrayList<Integer> ans = new ArrayList<>();
       int sum = 0;
       while(j<arr.length){
        sum = sum + arr[j];
        while(sum > s && i<arr.length) {
            sum -= arr[i];
            i++;
        }
        if(sum ==  s){
            ans.add(i+1);
            ans.add(j+1);
            return ans;
        }
        j++;
       }
       ans.add(-1);
       return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int s = 12;
        System.out.println(solve(arr,s));
    }
}