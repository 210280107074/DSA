public class p1404_leetcode {
   
    public static int solve(String s){
        int ans=0;
        while (!s.equals("1")) {
            if (s.charAt(s.length() - 1) == '1') {
                s = addOne(s);
                System.out.println(s);
            } else {
                s = divide(s);
                System.out.println(s);
            }
            ans++;
        }
        return ans;
    }
    public static String addOne(String s){
        char[] c = s.toCharArray();
        boolean carry = true;
        
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] == '0') {
                c[i] = '1';
                carry = false;
                break;
            } else {
                c[i] = '0';
            }
        }
        
        if (carry) {
            s = '1' + new String(c);
        } else {
            s = new String(c);
        }
        
        return s;
    }
    public static String divide(String s){
      char[] c = s.toCharArray();
      c[0] = '0';
        for(int i=c.length-1;i-2>=0;i--){
            c[i] = c[i-1];
        }
        return new String(c);
    }
    public static int solve2(String s){
        int ans = 0;
        int nums = Integer.parseInt(s,2);
        while(nums != 1){
            if(nums%2==1){
                nums = nums + 1;
                ans++;
            }
            else{
                nums = nums/2;
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "1101";
        // System.out.println(solve(s));
        System.out.println(solve2(s));
        // System.out.println(addOne(s));
        // System.out.println(divide(s));
    }
}
