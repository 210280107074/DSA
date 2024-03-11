import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class p791_leetcode{
    public static String fn(String order,String s){
    //    HashMap<Character,Integer> map = new HashMap<>();
       
       StringBuilder ans = new StringBuilder();
       ArrayList<Character> list1 = new ArrayList<>();
       ArrayList<Character> list2 = new ArrayList<>();
       for(int i=0;i<order.length();i++){
           list1.add(order.charAt(i));
       }
       for(int i=0;i<s.length();i++){
           list2.add(s.charAt(i));
       }
       int i=0;
       while(i<list1.size()){
        Character c = list1.get(i);
        if(list2.contains(c)){
            ans.append(c);
            // System.out.println(ans);
            list2.remove(Character.valueOf(c));
        }
        if(!list2.contains(c)){
            i++;
        }
       }
       for (char c : list2) {
        ans.append(c);
    }
       
       String ans2 = ans.toString();
       return ans2;
   }


    public static void main(String[] args) {
     System.out.println(fn("kqep","pekeq"));
    }

}