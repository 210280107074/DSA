import java.util.*;
public class count_the_occurebce_of_anagram {
    public static void main(String[] args) {
        System.out.println("enter the string : ");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println("enter the anagram string : ");
            String arm = sc.nextLine();
            int length = arm.length();
            HashMap<Character,Integer> map1 = new HashMap<>();
            for(int i=0;i<length;i++)
            {
                map1.put(arm.charAt(i), map1.getOrDefault(arm.charAt(i), 0) + 1);
            }
            int i = 0;
            int j = 0;
            int ans = 0;
            int k = length;
            int count = 0;
            for (int value : map1.values()) {
                count += value;
            }        
            while(j<str.length())
            {
                if(map1.containsKey(str.charAt(j))){
                    map1.put(str.charAt(j),map1.get(str.charAt(j))-1);
                    if(map1.get(str.charAt(j))==0)
                    {
                        count-- ;
                    }
                }
               else if(j-i+1 < k){
                j++;  
               }
                else if(j-i+1 == k){
                    if(count == 0){
                        ans++;
                    }
                    if(map1.containsKey(str.charAt(i)))
                    {
                        map1.put(str.charAt(i),map1.get(str.charAt(i))+1);
                        if(count == 0)
                        {
                            count++;
                        }
                    }
                     i++;
                    j++;
                }
            } 
            System.out.println("count of total anagrams are = "+ ans);
        }
    }
}
