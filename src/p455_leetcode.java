import java.util.Arrays;

public class p455_leetcode {
    public static int findContentChildren(int[] greedFactors, int[] cookieSizes) {
        Arrays.sort(greedFactors);
        Arrays.sort(cookieSizes);

        int contentChildren = 0;
        int i = 0; // Pointer for greedFactors
        int j = 0; // Pointer for cookieSizes

        while (i < greedFactors.length && j < cookieSizes.length) {
            if (cookieSizes[j] >= greedFactors[i]) {
                // Assign the cookie to the child, and move to the next child and cookie
                contentChildren++;
                i++;
            }
            j++; // Move to the next cookie
        }

        return contentChildren;
    }

    public static void main(String[] args) {
        // Example usage
        int[] greedFactors = {1, 2, 3};
        int[] cookieSizes = {1, 1, 2};

        int maxContentChildren = findContentChildren(greedFactors, cookieSizes);
        System.out.println("Maximum number of content children: " + maxContentChildren);
    }
}
