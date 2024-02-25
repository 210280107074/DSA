import java.util.*;

public class temp45 {
    public static void main(String[] args) {
        // Sample array
        Integer[] array = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1}; // Sample array with duplicates
        
        // Create a HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        hashSet2.add(5);
        hashSet2.add(51);
        hashSet2.add(53);
        hashSet2.add(555);
        hashSet2.add(5087);

        // Add all elements of the array to the HashSet using addAll() method
        hashSet.addAll(Arrays.asList(array));
        
        // Print the HashSet to verify the elements
        System.out.println("HashSet: " + hashSet);
        System.out.println("HashSet: " + hashSet2);
    }
}
