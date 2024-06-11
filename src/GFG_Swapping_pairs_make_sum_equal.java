class GFG_Swapping_pairs_make_sum_equal {
    static long findSwapValues(long a[], int n, long b[], int m) {
        long suma = 0;
        long sumb = 0;
        for(int i = 0;i<a.length;i++){
            suma+=a[i];
        }
        for(int j=0;j<b.length;j++){
            sumb+=b[j];
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(suma-a[i]+b[j] == sumb-b[j]+a[i]){
                    System.out.println(a[i]);
                    System.out.println(b[j]);
                    System.out.println(suma-a[i]+b[j] );
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        long[] arr1 = {10,10,10,10};
        long[] arr2 = {5,5,5,5};
System.out.println(findSwapValues(arr1, 0, arr2, 0));
    }
}
