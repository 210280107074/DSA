class p2486_leetcode {
    public static int appendCharacters(String s, String t) {
        char[] main = s.toCharArray();
        char[] sub = t.toCharArray();
        int i=0;
        int j=0;
        while(i<main.length && j<sub.length){
            if(main[i] == sub[j]){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        System.out.println(j);
        int ans = sub.length-j;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching","coding"));
    }
}