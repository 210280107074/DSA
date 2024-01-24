public class p1422_leetcode {
    public static int maxScore(String s) {
        int total = 0;
        int zero_count = 0;
        int one_count = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '0'){
                zero_count++;
            }
            for(int j=i+1;j<s.length();j++){
               
                    if(s.charAt(j)=='1'){
                        one_count++;
                    }
        
            }
            total = Math.max(total, one_count+zero_count);
            one_count = 0;
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "00111";
        System.out.println(maxScore(s));
    }
}
