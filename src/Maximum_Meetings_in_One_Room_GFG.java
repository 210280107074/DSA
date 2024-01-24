import java.util.ArrayList;

public class Maximum_Meetings_in_One_Room_GFG {

    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<Integer> list = new ArrayList<>();

        // Sort meetings by finish time using insertion sort
        for (int i = 1; i < N; ++i) {
            int key1 = F[i];
            int key2 = S[i];
            int j = i - 1;
            while (j >= 0 && F[j] > key1) {
                F[j + 1] = F[j];
                S[j + 1] = S[j];
                j = j - 1;
            }
            F[j + 1] = key1;
            S[j + 1] = key2;
        }

        // Select meetings
        list.add(1);
        int i = 0;
        int k = 1;
        while (k < N) {
          if(S[k]==F[i] && S[k]!=F[k]){
            k++;
        }
            if (S[k] > F[i]) {
                i = k;
                list.add(k + 1);
            }
            k++;
        }

        return list;
    }

    public static void main(String[] args) {
        int N = 3;
        int[] S = {1, 3, 5};
        int[] F = {3, 3, 5};

        ArrayList<Integer> result = maxMeetings(N, S, F);

        System.out.println("Selected meetings: " + result);
    }
}
