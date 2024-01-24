// public class revertse_the_number_recursion {
//     static int reverse(int n){
    
//         int digits = (int)(Math.log10(n))+1;
//         return helper(n,digits);
//     }
//     static int helper(int n,int digits){
//             if(n%10 == 0){
//             return n;
//         }
//         int rem = n % 10;
//         return rem*(int)Math.pow(10, digits -1) + helper(n/10,digits - 1);
//     }
//     public static void main(String[] args) {
//         System.out.println(reverse(12345678));
//     }
// }
public class revertse_the_number_recursion {
    public static int reverse(int num){
        if(num < 0){
        num = num * (-1);
        int digit = (int)(Math.log10(num))+1;
        return (-1)*helper(num,digit);
        }
        else{
            int digit = (int)(Math.log10(num))+1;
            return helper(num,digit);
        }
    }
    public static int helper(int num,int digit){
        if(num%10 == 0){
            return num;
        }
        int rem = num%10;
        return rem*(int)Math.pow(10,digit-1) + helper(num/10,digit-1);
    }
    public static void main(String[] args) {
        int number = 012;
        System.out.println(reverse(number));
    }
}