import java.util.Arrays;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
public class job_scheduling {
    public static int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr,(a,b) -> b.profit - a.profit);
        int maxDead = 0;
        for(int i=0;i<arr.length;i++){
            maxDead = Math.max(maxDead,arr[i].deadline);
        }
        int[] sdjobs  = new int[maxDead+1]; // job scheduling starts from day 1 to maximum deadline dat that's why here maxDead+1 sized array is created
        Arrays.fill(sdjobs,-1);
        int maxProfit = 0;
        int maxJobs = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(sdjobs[j] == -1){
                    sdjobs[j] = arr[i].id;
                    maxProfit+=arr[i].profit;
                    maxJobs++;
                    break;
                }
            }
        }
        int[] ans = new int[2];
        ans[0] = maxJobs;
        ans[1] = maxProfit;
        return ans;
    }
    public static void main(String[] args) {
        Job job1 = new Job(1,4,20);
        Job job2 = new Job(2,1,10);
        Job job3 = new Job(3,1,40);
        Job job4 = new Job(4,1,30);
        Job[] arr = {job1,job2,job3,job4};
        System.out.println(JobScheduling(arr,4)[0]);
        System.out.println(JobScheduling(arr,4)[1]);
    }
}
