import java.util.ArrayList;

public class GFG_2902 {
    static long sumBitDifferences(int[] arr, int n) {
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            temp.add(arr[j]);
            list.add(temp);
        }
      } 
      long ans = 0;
    
      for(int i=0;i<list.size();i++){
        ArrayList<Integer> tempList = new ArrayList<>();
         tempList = list.get(i);
       
        //  ans = ans + countBitsDifference(tempList.get(0), tempList.get(1));
         ans = ans + (long)fn(tempList.get(0)^tempList.get(1));
      }
      return ans;
    }
    public static int countBitsDifference(int a, int b) {
      int xorResult = a ^ b;
      int count = 0;
      while (xorResult != 0) {
          count += xorResult & 1;
          xorResult >>= 1;
      }
      return count;
  }
  static int fn(int n){
    int count = 0;
    while (n != 0) {
      
      if ((n & 1) == 1) {
          count++;
      }
      
      n >>= 1;
  }
    return count;
  }
    public static void main(String[] args) {
      int arr[] = new int[]{1, 2};
      System.out.println(sumBitDifferences(arr, 3));
      // System.out.println(5^3);
      // System.out.println(fn(5^3));
    }
}
