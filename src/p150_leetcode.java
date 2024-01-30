import java.util.ArrayList;
import java.util.Stack;

class p150_leetcode {
    public static int solve(String[] token) {
      Stack<String> s = new Stack<>();
      ArrayList<String> list = new ArrayList<>();
      list.add("+");
      list.add("-");
      list.add("*");
      list.add("/");
      for(int i=0;i<token.length;i++){
          if(i!=0 && list.contains(token[i])){
              int a = Integer.parseInt(s.pop());
              int b = Integer.parseInt(s.pop());
              int ans =  operation(token[i],a,b);
             s.push(Integer.toString(ans));
          }
          else{
              s.push(token[i]);
          }
      }  
      return Integer.parseInt(s.pop());
    }
    public static int operation(String s,int a,int b){
        if(s == "+"){
            return b+a;
        }
        if(s == "-"){
            return b-a;
        }
        if(s == "*"){
            return a*b;
        }
        if(s == "/"){
            return b/a;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        String[] token = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(solve(token));

    }
}