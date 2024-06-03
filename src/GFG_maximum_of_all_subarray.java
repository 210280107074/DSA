import java.util.ArrayList;

class GFG_maximum_of_all_subarray
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        int i = 0;
        int j = 0;
        int max = arr[0];
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr.length == 1){
            ans.add(arr[0]);
            return ans;
        }
        while(j<arr.length && i<arr.length){
            while(count != k && j<arr.length && i<arr.length){
                max = Math.max(arr[j],max);
                count++;
                System.out.println(count);
                j++;
            }
            if(count == k){
                ans.add(max);
                count = 0;
                max = 0;
                i++;
                j=i;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 ,5};
        System.out.println(max_of_subarrays(arr, 0, 5));
    }
}