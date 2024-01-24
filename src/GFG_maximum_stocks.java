import java.util.Arrays;

public class GFG_maximum_stocks {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        long[] a = new long[n];
        int count = 0;
        for(int i=0;i<n;i++){
            a[i] = price[i]*100000 + (i+1);
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            int pr = (int)a[i]/100000;
            int day = (int)a[i]%100000;
            if(pr*day<=k){
                count = count+day;
                k=k-pr*day;
            }
            else{
                count = count + k/pr;
                k = k-pr*(k/pr);
            }
                }
            return count;
    }
    
    public static void main(String[] args) {
        int[] price = new int[]{11,13,9,4};
        int k = 45;
        int n=price.length;
        System.out.println(buyMaximumProducts(n, k, price));
   
    }
}
