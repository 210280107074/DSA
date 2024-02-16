

class p7_leetcode {
            public static int reverse(int num){
               long ans = 0;
               int temp = num;
               num = Math.abs(num);
                int size=0;
                int n= num;
                size = String.valueOf(num).length()-1;
                // while(n>0){
                //     n/=10;
                //     size++;
                // }
                // size--;
               while(num>0){
                  int last = num%10;
                  num = num/10;
                  ans = ans + last*(long)Math.pow(10,size);
                  size = size-1;
               }
               if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
                   return 0;
               }
               else if(temp>=0){
                  return (int)ans;  
               }
               else{
                   return (int)ans*(-1);
               }
        }
            
    
    public static void main(String[] args) {
        int num = 1534236469;
        // System.out.println((int)Math.log10(Math.abs(num)));
        String s = String.valueOf(num);
       System.out.println(reverse(num));
    }
        
}