import java.util.ArrayList;
import java.util.Arrays;

class GFG_2003{
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      list.add("i");
      list.add("like");
      list.add("sam");
      list.add("sung");
      list.add("samsung");
      list.add("mobile");
    String a = "imlikesamsung";
    String temp ;
    int i = 0;
    int j = 1;
    while(i<a.length() && j<=a.length()){
        temp = a.substring(i, j);                                   //4
                                                                    //ab bcd b a
                                                                    //abcd
        if(list.contains(temp)){
            System.out.println(temp);
            i = j;
            j++;
        }
        
        else{
            j++;
        }
    }
    if(i==a.length()){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    }
}