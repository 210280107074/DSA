public class p1531_leetcode {
    public static StringBuilder getLengthOfOptimalCompression(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int x = 1;
        int p = 1;
        int length = sb.length();
        for(int i=0;i<length;i++){
            while(x < length && sb.charAt(i) == sb.charAt(x)){
                p++;
                x++;
            }
            if(p>1){
                sb.replace(i+1, x, String.valueOf(p));
                length =length - (p-2) ;
                p=1;
                i = x-2;
            }
            else{
                x = i+2;
            }

        }
        return sb;
    }
    public static void main(String[] args) {
        String sb = "aabbaa";
        System.out.println( getLengthOfOptimalCompression(sb,3));
        




    }

    
}
