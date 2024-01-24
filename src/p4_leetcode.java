public class p4_leetcode {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int i=0;
        int j=0;
        int k=0;
        int [] merge = new int[nums1.length + nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                merge[k] = nums1[i];
                k++;
                i++;
            }
            else {
               merge[k] = nums2[j];
                j++;
                k++;
            }
        }
         while (i < nums1.length) {
            merge[k] = nums1[i];
            i++;
            k++;
        }
    
        while (j < nums2.length) {
            merge[k] = nums2[j];
            j++;
            k++;
        }
        int up = nums1.length + nums2.length - 1;
        if(up%2 == 0){
            median = merge[up/2];
        }
        else {
            median = merge[up/2] + merge[(up/2)+1];
            median = (double)median/2;
        }
        return median;
    }
    public static int[] findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] merge = new int[nums1.length + nums2.length];
    
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                merge[k] = nums1[i];
                i++;
            } else {
                merge[k] = nums2[j];
                j++;
            }
            k++;
        }
    
        while (i < nums1.length) {
            merge[k] = nums1[i];
            i++;
            k++;
        }
    
        while (j < nums2.length) {
            merge[k] = nums2[j];
            j++;
            k++;
        }
    
        int up = nums1.length + nums2.length - 1;
        if (up % 2 == 0) {
        } else {
        }
        return merge;
    }
    
    public static void main(String[] args) {
    int[] nums1 = {1,2};
    int[] nums2 = {3,4};
    System.out.println(findMedianSortedArrays(nums1,nums2));
    
    }
}
