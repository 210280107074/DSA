class p50_leetcode{
    static double ans = 1;
    public static double myPow(double x, double n) {
        double result;
        if(n<0){
            result = 1/fn(-n,x);
        }
        else{
             result = fn(n,x);
        }
        return result;
    }
    public static double fn(double n,double x){
     if(n==0){
         return 1;
     }
     
     else{
         ans = x*fn(n-1,x);
         return ans;
     }
    }
    public static void main(String[] args) {
        System.out.println(myPow(0.00001, 2147483647));
    }
}