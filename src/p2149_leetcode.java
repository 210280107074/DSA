public class p2149_leetcode {
    
    public static int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        
        int p = 0;
        int n = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[p] = nums[i];
                p++;
            }
            else{
                neg[n] = nums[i];
                n++;
            }
        }
        print(pos);
        print(neg);
        p=0;
        n=0;
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0 ){
                ans[i] = pos[p];
                p = p+1;
            }
            else{
                ans[i] = neg[n];
                n = n+1;
            }

        }
        print(ans);
        return ans;
    }
public static void print(int n[]){
for(int i=0;i<n.length;i++){
    System.out.print(n[i] + " ");
}
System.out.println();
}
public static void main(String[] args) {
    int[] arr = new int[]{3,1,-2,-5,2,-4};
    rearrangeArray(arr);
}
}