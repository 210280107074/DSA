import java.io.*;
import java.util.*;

class  longest_common_priffix{
   static String longestCommonPrefix(String arr[], int n) {
        String ans = "";
        int minLength = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            minLength = Math.min(minLength, arr[i].length());
        }
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0, minLength);
        }
       
        for (int i = 0; i < arr[0].length(); i++) {
            char c = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (c != arr[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            else{
                ans = ans + c;
            }
        }
        if (ans.length() == 0) {
            return "-1";
        }
        return ans;
    }
    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geek","geezer"};
        System.out.println(longestCommonPrefix(arr, arr.length));
    }
}