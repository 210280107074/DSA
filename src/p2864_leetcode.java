class p2864_leetcode {
    public static String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int zeros = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeros++;
            }
            else{
                ones++;
            }
        }
        String result = "";
        for(int i=0;i<s.length();i++){
            if(ones>1 || (i==s.length()-1 && ones == 1)){
                result = result + "1";
        
                ones--;
            }
            else{
                result = result + "0";
                
                zeros--;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("11"));
    }
}