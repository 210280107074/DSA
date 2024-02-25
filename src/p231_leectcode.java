class p231_leectcode{
    public static boolean isPowerOfTwo(int n) {
        return fn(n,1);
    }
    public static boolean fn(long n,long x){
        if(n>Integer.MAX_VALUE){
            return false;
        }
        else if(n==x){
            return true;
        }
        else if(n<x){
            return false;
        }
        else{
            return fn(n,2*x);
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1073741825));
    }
}