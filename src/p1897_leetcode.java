import java.util.HashMap;


public class p1897_leetcode {
    public static boolean makeEqual(String[] words) {
        HashMap <Character, Integer> str_cnt = new HashMap<Character,Integer>(); 
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(str_cnt.containsKey(words[i].charAt(j))){
                    int value = str_cnt.get(words[i].charAt(j)) + 1;
                    str_cnt.put(words[i].charAt(j),value);
                }
                else{
                    str_cnt.put(words[i].charAt(j),1);
                }
            }
        }
        for(Character key : str_cnt.keySet()){
            if(str_cnt.get(key) % words.length != 0){
                return false;
            }
        }
       return true;
    }
    public static void main(String[] args) {
        String []words = new String[]{"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }
}
