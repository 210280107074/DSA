import java.math.BigInteger;

public class GFG_0203{
        static int  DivisibleByEight(String s){
          
                int length = s.length();
              // If the length of the string is less than 3, the number cannot be divisible by 8
              if (length < 3) {
                  int num = Integer.parseInt(s);
                  if(num % 8 == 0){
                   return 1;   
                  }
                  return -1;
              } else {
                  // Take the last 3 digits of the number
                  String lastThreeDigits = s.substring(length - 3);
                  int num = Integer.parseInt(lastThreeDigits);
                  System.out.println(num);
                 if(num % 8 == 0){
                   return 1;   
                  }
                  return -1;
              }
          
      }
    
    public static void main(String[] args) {
        System.out.println(DivisibleByEight("454905712"));
    }
}
