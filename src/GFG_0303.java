import java.util.ArrayList;
import java.util.Collections;

public class GFG_0303{
    public static String printLargest(String[] arr) {
    ArrayList<Character> list = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length();j++){
            list.add(arr[i].charAt(j));
        }
    }
    Collections.sort(list);
    String ans= "";
    for(int i=list.size()-1;i>=0;i--){
        ans = ans + list.get(i);
    }
        return ans;
    }
    public static void main(String[] args) {
        String[] s = new String[]{"54", "546", "548", "60"};
        System.out.println(printLargest( s ));
    }
}