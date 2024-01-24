public class p1624_leetcode {
    public int maxLengthBetweenEqualCharacters(String s) {
       int length = -1; // Initialize to -1, as the minimum possible length is 0
       for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    String sub = s.substring(i + 1, j);
                    length = Math.max(sub.length(), length);
                    // i = j - 1; // This line is not needed
                }
            }
       } 
       return length;
    }

    public static void main(String[] args) {
        // Test your function here
        p1624_leetcode solution = new p1624_leetcode();
        String input = "cbzxy";
        int result = solution.maxLengthBetweenEqualCharacters(input);
        System.out.println(result);
    }
}
