public class backtracking_maze_problems{
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
    public static void printWays(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        else{
            if(r>1){
                printWays(p+"R", r-1, c);
            }
            if(c>1){
                printWays(p+"D", r, c-1);
            }
        }
    }
    public static void printRestrictionWays(String p,boolean[][] maze, int r,int c){  //here we starts from 0,0 and goes like 3,3... 
        if(r==maze.length-1 && c==maze[0].length-1 ){
            System.out.println(p);
            return;
        }
      
        if(maze[r][c]==true){                    // obstacle is there at the position 
            return ;  
        }
            if(r<maze.length-1){
                printRestrictionWays(p+"R", maze, r+1, c);
            }
            if(c<maze[0].length-1){
                printRestrictionWays(p+"D", maze , r, c+1);
            }
        
    }
    public static void printWays2(String p,boolean[][] maze, int r,int c){  //here we starts from 0,0 and goes like 3,3... 
        if(r==maze.length-1 && c==maze[0].length-1 ){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        maze[r][c] = false;
            if(r<maze.length-1){
                printWays2(p+"D", maze, r+1, c);
            }
            if(c<maze[0].length-1){
                printWays2(p+"R", maze , r, c+1);
            }
            if(r>0){
                printWays2(p+"U", maze , r-1, c);

            }
            if(c>0){
                printWays2(p+"L", maze , r, c-1 );

            }
        maze[r][c] = true;
    }
    public static void main(String[] args) {
        // System.out.println(countWays(4,4));
        // printWays("", 4, 4);
        boolean maze[][] = new boolean[][]{
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        // printRestrictionWays("", maze, 0, 0);
        printWays2("", maze, 0, 0);
    }
}