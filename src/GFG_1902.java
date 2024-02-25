public class GFG_1902 {
    
    public static int maxSubsetXOR(int arr[], int N)
    {
        int res = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                  res = Math.max(res,arr[i]^arr[j]);  
            }
        
        }
            return res;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2 ,3 ,4, 5, 6, 22, 33, 44, 22, 111};
        maxSubsetXOR(arr, 11);    
    }
}
