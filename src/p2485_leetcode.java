class p2485_leetcode{
    public static int pivotInteger(int n) {
        int psum = 0;
        int ssum = n;
        int i = 0;
        int j = n;
        if(n==1){
            return 1;
        }
        while(i<=j){
            if(psum == ssum && i==j){
                return i;
            }
            else if(psum<ssum){
                i++;
                psum+=i;
            }
            else{
                j--;
                ssum+=j;
            }
        }
        // System.out.println(i);
        // System.out.println(j);
        // System.out.println(psum);
        // System.out.println(ssum);
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotInteger(3));
    }
}