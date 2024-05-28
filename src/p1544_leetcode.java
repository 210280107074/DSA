class p1544_leetcode{
    public static String fn(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = 1;
        while(i<sb.length()){
            char c1 = sb.charAt(i-1);
            char c2 = sb.charAt(i);
            System.out.println(i+c2);
            System.out.println(i+c2);
            if(Math.abs((int)c1 - (int)c2) == 32){
                sb.delete(i-1, i+1);
                if(i-1 > 0){
                    i = i-1;
                }
            }
            else{
                i++;
            }
            System.out.println(sb);
        }
        s = sb.toString();
        return s;
    }
    public static void main(String[] args) {
        char c = 'A';
        char c1 = 'a';
        System.out.println(fn("leEeetcode"));
    }
}