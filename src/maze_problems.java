public class maze_problems{
    public static int countWays(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        else{
            int right = countWays(r, c-1);
            int down = countWays(r-1, c);
            return right + down;
        }
    }
    public static void main(String[] args) {
        System.out.println(countWays(4,4));
    }
}