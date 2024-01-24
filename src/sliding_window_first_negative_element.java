import java.util.*;

public class sliding_window_first_negative_element{
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the window size: ");
        int k = sc.nextInt();
        int i = 0;
        int j = 0;
        Queue<Integer> list = new LinkedList<>();
        Queue<Integer> finalList = new LinkedList<>();

        while (j < size) {

            if (arr[j] < 0) {
                list.offer(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (list.isEmpty()) {
                    finalList.offer(0);
                } else {
                    finalList.offer(list.peek());
                    if (arr[i] == list.peek()) {
                        list.poll();
                    }
                    i++;
                    j++;
                }
            }
        }

        // Display the result
        System.out.println("Result:");
        while (!finalList.isEmpty()) {
            System.out.print(finalList.poll() + " ");
        }
    }
}
