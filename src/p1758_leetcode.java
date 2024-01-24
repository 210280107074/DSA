public class p1758_leetcode{
    public static int minOperations2(String s) {
        int o=0;
        int z=0;
        for(int i=0;i<s.length();i++){
            if(i%2 == 0){
                if(s.charAt(i) == '0'){
                    o++;
                }
                else{
                    z++;
                }
            }
            else{
                if(s.charAt(i) == '0'){
                    z++;
                }
                else{
                    o++;
                }
            }
        }
        return Math.min(z,o);
    }
    public static int minOperations(String s) {
        StringBuilder builder1= new StringBuilder(s);
        StringBuilder builder2 = new StringBuilder(s);
        int changes1 = 0;
        int changes2 = 0;
        for(int i=0;i<builder1.length();i++){
            if(i%2 == 0){
                if(builder1.charAt(i) != '1'){
                    builder1.setCharAt(i, '1');
                    changes1++;
                }
            }
            else if(builder1.charAt(i)!='0'){
                builder1.setCharAt(i, '0');
                changes1++;
            }
        }
        for(int i=0;i<builder2.length();i++){
            if(i%2 == 0){
                if(builder2.charAt(i) != '0'){
                    builder2.setCharAt(i, '0');
                    changes2++;
                }
            }
            else if(builder2.charAt(i)!='1'){
                builder2.setCharAt(i, '1');
                changes2++;
            }
        }
        return Math.min(changes1,changes2);
        
    }
    public static void main(String[] args) {
            String s = "1";
        System.out.println(minOperations(s));
        System.out.println(minOperations2(s));
    }
}