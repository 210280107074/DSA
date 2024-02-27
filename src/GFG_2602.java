
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG_2602 {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if(sum == s){
                list.add(i+1);
                list.add(i+1);
            }
            else{
                for (int j = i + 1; i + 1 < arr.length; j++) {
                        sum = sum + arr[j];
                        if (sum == s) {
                            System.out.println(arr[i]);
                            System.out.println(arr[j]);
        
                            list.add(i + 1);
                            list.add(j + 1);
                            i = j;
                            break;
                        }
                        if (sum > s) {
                            break;
                        }
                }
            }
            if (list.size() == 2) {
                break;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[] = new int[] {4,2,2,5};
        int n = arr.length;
        int s = 7;
        System.out.println(subarraySum(arr, n, s));
    }

}