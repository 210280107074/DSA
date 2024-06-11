import java.util.ArrayList;
import java.util.HashMap;

class  p648_leetcode{
    // public static String replaceWords(ArrayList<String> dictionary, String sentence) {
    //     int i = 0;
    //     String ans = "";
    //     String str = sentence;
    //     while(i<str.length()){
    //         StringBuilder sb = new StringBuilder();
    //         String value = " ";
    //         boolean flag = false;
    //         while(i<str.length() && str.charAt(i) != ' '){
    //             sb = sb.append(str.charAt(i));
    //             if(dictionary.contains(sb.toString()) && flag == false){
    //                 value = sb.toString().trim();
    //                 flag = true;
    //             }
    //             i++;
    //         }
    //         if(value.equals(" ")){
    //             ans = ans + sb.toString();
    //         }
    //         else{
    //             ans = ans + value;
    //         }
    //         ans +=" ";
    //         i++;    
    //     }
    //     return ans;
    // }
    public static String replaceWords(String[] dictionary, String sentence) {
        HashMap<Character, String> map = new HashMap<>();
        for (String word : dictionary) {
            map.put(word.charAt(0), word);
        }
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i].charAt(0))) {
                if (words[i].contains(map.get(words[i].charAt(0)))) {
                    words[i] = map.get(words[i].charAt(0));
                }
            }
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        
        String s =  "aadsfasf absbs bbab cadsfafs";
        System.out.println(s);
        System.out.println(replaceWords(list,s));
    }
}