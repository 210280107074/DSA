class BitWise{
    public static void main(String[] args) {
        int n = 6;
        int base = 5;
        int ans = 0;
        int last;
        while(n>0){
            last = n&1;
            n = n>>1;
            ans = ans + last*base;
            base = base*5;
        }
        System.out.println(ans);


        int number = 565654545;
        int digits2 = (int)Math.log10(number)+1;
        System.out.println(digits2);

        System.out.println(1<<4);   //  1<<n = 2^n-1

        int a = 30;
        int cmpt = a-1;
        int res1 = a&cmpt;
        if(res1==0){
            System.out.println("number is power of 2");
        }
        else{
            System.out.println("number is not power of 2");
        }
    }
}