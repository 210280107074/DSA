public class p2125_leetcode {
    public static int numberOfBeams(String[] bank) {
        int result = 0;
        int prev=0;
        for(int i=0;i<bank.length;i++){
            int current = 0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j) == '1'){
                    current++;
                }
            }
            result = result+current*prev;
            if(current != 0){
                prev = current;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] bank = new String[]{"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
}
