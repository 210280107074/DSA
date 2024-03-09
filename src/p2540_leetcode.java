class p2540_leetcode {
    public static int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j = 0;
        // int k=0;
        while(i<nums1.length && j<nums2.length )
        {
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i] == nums2[j]){
                return nums1[i];
            }
            else{
                j++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums1[] = new int[]{1,2,3,6};
        int nums2[] = new int[]{2,3,4,5};
        System.out.println(getCommon(nums1, nums2));
    }
}