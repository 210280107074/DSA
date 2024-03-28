import java.util.Arrays;
import java.util.Comparator;

public class sortest_job_first {
    public static int fn(int jobs[][]){
        Arrays.sort(jobs,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return Integer.compare(a[1], b[1]);
            }
        });
        int preve = jobs[0][1];
        int count = 1;
        for(int i=1;i<jobs.length;i++){
            if(preve<=jobs[i][0]){
                count++;
                System.out.print(jobs[i][0]+" ");
                System.out.print(jobs[i][1]);
                System.out.println();
                preve = jobs[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int jobs[][] = new int[][]{{1,4},{3,5},{0,6},{5,7},{3,8},{5,9},{6,10},{8,11},{8,12},{2,13},{12,14}};
        // for(int i=0;i<jobs.length;i++){
        //     System.out.print(jobs[i][0]);
        //     System.out.print(jobs[i][1]);
        //     System.out.println();
        // }
        System.out.println(fn(jobs));
    }
}
