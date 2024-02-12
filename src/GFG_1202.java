class GFG_1202 {

    static final int MOD = 1000000007;

    static long sequence(int n) {
        long ans = 0;
        long k = 1;

        for (int i = 1; i <= n; i++) {
            long temp = 1;
            for (int j = 1; j <= i; j++) {
                temp = (temp * k) % 1000000007;
                k++;
            }
            ans = (ans + temp) % 1000000007;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(sequence(n));
    }
}