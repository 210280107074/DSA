import java.util.Arrays;
import java.util.Comparator;

class p452_leetcode {
    public static int findMinArrowShots(int[][] points) {
        int currs ;
        int curre ;
        Arrays.sort(points, new Comparator<int[]>(){

            public int compare(int []a , int []b){
                return Integer.compare(a[0],b[0]);
            }
        });
        int count = 1;
        int prevs = points[0][0];
        int preve = points[0][1];
        for(int i=0;i<points.length;i++){
            currs = points[i][0];
            curre = points[i][1];
            if(currs > preve){
                count++;
                prevs = currs;
                preve = curre;
            }
            else{
                prevs = Math.max(currs,prevs);
                preve = Math.min(curre,preve);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int points[][] = new int[][]{{1,2},{2,3},{3,4},{4,5}};
        System.out.println(findMinArrowShots(points));
    }
}