import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

class p49_leetcode {
    public static List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            String s = String.valueOf(arr);
            if(map.containsKey(s)){
                map.get(s).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(s,list);
            }
        }
        for (List<String> value : map.values()) {
            ans.add(value);
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}