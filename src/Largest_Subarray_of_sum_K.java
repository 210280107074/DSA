import java.util.*;

public class Largest_Subarray_of_sum_K {
    public static void main(String[] args) {
        System.out.println("enter the size of array : ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            System.out.println("enter elements in array : ");
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the sum : ");
            int k = sc.nextInt();
            int i = 0;
            int j = 0;
            int sum = 0;
            int max = 0;
            while (j < size) {
                if (sum < k) {
                    sum = sum + arr[j];
                    j++;
                } 
                else if (sum == k) {
                    max = Math.max(j - i + 1, max);
                    j++;
                }
                else if (sum > k) {
                    while (sum > k) {
                        sum = sum - arr[i];
                        i++;
                    }
                    j++;
                }
            }
            System.out.println("ans : " + max);
        }
    }
}
