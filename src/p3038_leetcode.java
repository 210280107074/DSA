public class  p3038_leetcode {
    
        public int maxOperations(int[] nums) {
            int count = 0;
            int sum = 0;
            int prev = 0;
            for(int i=0;i+1<nums.length;i+=2){
                sum = nums[i] + nums[i+1];
                if(i==0){
                    prev = sum ;
                    count++;
                }
                else if(prev == sum){
                    count++;
            }
                else{
                    return count;
                }
                return 0;
            
        }
    }
    public static void main(String[] args) {
        
    }
    }

