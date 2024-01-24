import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPermutations {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            List<List<Integer>> permutations = generateArrayPermutation(array);

            System.out.println("Permutations of the array:");
            for (List<Integer> permutation : permutations) {
                System.out.println(permutation);
            }
        }
    }

    public static List<List<Integer>> generateArrayPermutation(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        List<Integer> remaining = new ArrayList<>();

        for (int num : arr) {
            remaining.add(num);
        }

        ArrayPermutations(current, remaining, result);
        return result;
    }

    private static void ArrayPermutations(List<Integer> current, List<Integer> remaining, List<List<Integer>> result) {
        if (remaining.isEmpty()) {
            result.add(new ArrayList<>(current));
            return;
        }

        int n = remaining.size();
        for (int i = 0; i < n; i++) {
            List<Integer> newCurrent = new ArrayList<>(current);
            newCurrent.add(remaining.get(i));

            List<Integer> newRemaining = new ArrayList<>(remaining);
            newRemaining.remove(i);

            ArrayPermutations(newCurrent, newRemaining, result);
        }
    }
}
