public class GFG_minimum_steps_for_jump {
    static int minJumps(int[] arr){
        int ans =0;
        int i=0;
        while(i!=arr.length-1 || i<arr.length){
            i = fn(arr,i);
            System.out.println(i);
            ans++;
        }
        return ans;
     }
     static int fn(int[] arr,int x){
         int idx = 0;
         for(int k=x;k<x+arr[x];k++){
             if(arr[k]+x == arr.length-1 || arr[k]+x > arr.length-1 ){
                 return arr[k]+x;
             }
             else if(arr[k]+x<arr.length ){
                 idx = Math.max(idx,arr[k]+x);
             }
             else{
                 continue;
             }
         }

         return idx;
     }
     public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
     }
}
