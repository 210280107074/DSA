import java.util.*;
public class sliding_window {
    public static void main(String[] args) {
        System.out.println("enter the size of array : ");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("enter the elements in array : ");
            for (int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the window size : ");
            int k = sc.nextInt();
            int max = 0;
            int sum = 0;
            int i = 0;
            int j = 0;
            while(j<size){
                sum = sum + arr[j];
                if((j-i+1)<k){
                    j++;
                }
                else if((j-i+1) == k)
                {
                    max = Math.max(sum, max);
                    sum = sum - arr[i];
                    i++;
                    j++;
                }
            }
            System.out.println("maximum sum is = "+max);
        }
    }
}
