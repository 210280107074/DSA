import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class subset_subsequence {
     static ArrayList<String> list = new ArrayList<>();
    public static String skip(String q, char k) {
        if (q.isEmpty()) {
            return "";
        }
        char ch = q.charAt(0);
        if (ch == k) {
            return skip(q.substring(1), k);
        } else {
            return ch + skip(q.substring(1), k);
        }
    }

    public static int BinarySearch(int arr[], int low, int high, int s) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == s) {
                return mid;
            } else if (arr[mid] > s) {
                return BinarySearch(arr, low, mid - 1, s);
            } else {
                return BinarySearch(arr, mid + 1, high, s);
            }
        } else {
            return -1;
        }
    }

    public static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void sequence(String str,String ans) {
        
        if(str.length() == 0){
            list.add(ans);
            return;
        }
        else{
          sequence(str.substring(1), ans + str.charAt(0));
          sequence(str.substring(1), ans);
        }
        
    }
    public static List<String> generatePermutations(String str){
        List<String> result = new ArrayList<>();
        stringPermutation("", str, result);
        return result;
    }
    public static void stringPermutation(String current,String remaining,List<String> result){
        if(remaining.equals("")){
            result.add(current);
        }
        int n = remaining.length();
        for(int i=0;i<n;i++){
            String newCurrent = current + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i+1);
             stringPermutation(newCurrent, newRemaining, result);
        }
    }
    public static List<List<Integer>> generateArrayPermutation(int arr[]){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> remaining = new ArrayList<>();
        for(int num : arr){
            remaining.add(num);
        }
        List<Integer> current = new ArrayList<>();
        ArrayPermutations(current,remaining,result);
        return result;
    }

    private static void ArrayPermutations(List<Integer> current, List<Integer> remaining, List<List<Integer>> result) {
       
        if(remaining.isEmpty()){
            result.add(current);
            return;
        }
        int n = remaining.size();
        for(int i=0;i<n;i++){
            List<Integer> newCurrent = new ArrayList<>(current);
            newCurrent.add(remaining.get(i));
            List<Integer> newRemaining = new ArrayList<>(remaining);
            newRemaining.remove(i);
            ArrayPermutations(newCurrent, newRemaining, result);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a choice: ");
        try (Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    String str = new String();
                    System.out.println("Enter a string: ");
                    str = sc.nextLine();
                    System.out.println("Enter a character that you want to skip: ");
                    char a = sc.next().charAt(0);
                    System.out.println(skip(str, a));
                    break;

                case 2:
                    System.out.println("Enter the size of array: ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Enter the number that you want to search: ");
                    int num = sc.nextInt();
                    System.out.println(BinarySearch(arr, 0, n - 1, num));
                    break;

                case 3:
                    System.out.println("Enter the size of array: ");
                    int l = sc.nextInt();
                    int[] arr2 = new int[l];
                    System.out.println("enter the elements in array : ");
                    for (int i = 0; i < l; i++) {
                        arr2[i] = sc.nextInt();
                    }
                    List<List<Integer>> ans = subset(arr2);
                    for (List<Integer> list : ans) {
                        System.out.print(list);
                        System.out.print(",");
                    }
                    break;

                case 4:
                String input = new String();
                System.out.println("Enter the string : ");
                input = sc.nextLine();

                List<String> permutations = generatePermutations(input);
   

                for (String perm : permutations) {
                    System.out.println(perm);
                }
                break;

                case 5:
                System.out.println("Enter the size of the array: ");
                int size = sc.nextInt();
                int[] array = new int[size];
            
                System.out.println("Enter the elements in the array: ");
                for (int i = 0; i < size; i++) {
                    array[i] = sc.nextInt();
                }
            
                List<List<Integer>> arrayPermutations = generateArrayPermutation(array);
            
                System.out.println("Permutations of the array:");
                for (List<Integer> permutation : arrayPermutations) {
                    System.out.print(permutation + " ");
                }
                break;
                case 6:
                System.out.println("Enter the String : ");
                String s = sc.nextLine();
                
                sequence(s," ");
                list.remove(" ");
                Collections.sort(list);
                System.out.println(list);

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
