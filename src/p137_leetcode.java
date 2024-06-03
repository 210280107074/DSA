public class p137_leetcode {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int k=0;k<=32;k++){
            int count = 0;
            int temp = (1 << k);
            for(int num : nums){
                if((num & temp) != 0){
                    count++;
                }
            }
            if(count%3 != 0){
                result = result | temp;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,3,2}));
    }
}
