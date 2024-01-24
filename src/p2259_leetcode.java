public class p2259_leetcode {
    public static String removeDigit(String number, char digit){
        int max = 0;
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i) == digit){
               StringBuilder sc = new StringBuilder(number);
               sc.deleteCharAt(i);
               number = sc.toString();
               break;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        String str = "fatafat";
        char ctr = 'a';
        System.out.println(removeDigit(str,ctr));
    }
    
}
