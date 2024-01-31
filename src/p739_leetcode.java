import java.util.Stack;

public class p739_leetcode{
    public static int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int n = temp.length - 1;
        int result[] = new int[temp.length];
        for(int i=n;i>=0;i--){
            while(!st.isEmpty() && temp[st.peek()] <= temp[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                result[i] = st.peek() - i;
            }
            else{
                result[i] = 0;
            }
            st.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] temp = {30,40,50,60};
        int result[] = dailyTemperatures(temp);
        for(int i=0;i<temp.length;i++){
            System.out.println(result[i]);
        }
    }
}