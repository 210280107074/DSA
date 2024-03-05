public class GFG_0503{
    static int maxIndexDiff(int a[], int n) { 
        int i=0;
       int j=n-1;
       int result = 0;
       while(i<j){
           if(a[i]<a[j]){
               if(result < (j-i)){
                   result = j-i;
                //    System.out.println(i);
                   System.out.println(j-i);
                   System.out.println(result);
               }
           }
           i++;
           j--;
       }
       return result; 
        
    }

    public static void main(String[] args) {
        int [] arr = new int[]{9,4,8,16,19,2};
        System.out.println(maxIndexDiff(arr,arr.length));
    }
}