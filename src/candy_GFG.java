import java.util.Arrays;

public class candy_GFG {
    static int minCandy(int N, int ratings[]) {
        int total = 0;
        int c_count[] = new int[N];
        Arrays.fill(c_count, 1);
        for(int i=1;i<N;i++)
        {
            if(ratings[i]>ratings[i-1]){
                c_count[i] = c_count[i - 1] + 1;
            }
            if(ratings[i]<ratings[i-1]){
               ratings[i-1] = Math.max(c_count[i], c_count[i + 1] + 1);
            }
        }
        for(int i=0;i<c_count.length;i++){
            total = total+c_count[i];
        }

        return total;

    }
    static int minCandy2(int N, int ratings[]) {
        int total = 0;
        int c_count[] = new int[N];
        Arrays.fill(c_count, 1);

        // Left to right pass
        for (int i = 1; i < N; i++) {
            if (ratings[i] > ratings[i - 1]) {
                c_count[i] = c_count[i - 1] + 1;
            }
        }

        // Right to left pass
        for (int i = N - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                c_count[i] = Math.max(c_count[i], c_count[i + 1] + 1);
            }
        }

        // Summing up the candies
        for (int i = 0; i < N; i++) {
            total += c_count[i];
        }

        return total;
    }
    public static void main(String[] args) {
        int n = 3;
       int[] ratings = {1,0,3};
       System.out.println(minCandy(n, ratings));
       System.out.println(minCandy2(n, ratings));
    }
}
