import java.util.Stack;

class Solution {
    public static boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>();
        int open = 0;
        int close = 0;
        int count = 0;
        for(Character c : s.toCharArray()){
            if(c == '('){
                stack.push('(');
            }
            else if (c == '*'){
                count ++;
            }
            else{
               if(!stack.isEmpty()){
                    stack.pop();
               }
               else if(stack.isEmpty() && count != 0){                
                    count--;
               }
               else{
                close++;
               }
            }
            
        }
        open = stack.size();
        int k = open - close;
        System.out.println(k);
        System.out.println(count);
        if(count == k){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        System.out.println(checkValidString(s));
    }
}
