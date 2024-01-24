

public class hashing_rabin_karp2 {
    public static long countHash(String text, int q, int length) {
        long hash = 0;
        for (int i = 0; i < length; i++) {
            hash = (hash * 256 + text.charAt(i)) % q; // Improved hash calculation
        }
        return hash;
    }

    public static long updateHash(long prevHash, char prevChar, char newChar, int patternLength, int q) {
        long newHash = (prevHash - (prevChar * (long) Math.pow(256, patternLength - 1)) % q + q) % q;
        newHash = (newHash * 256 + newChar) % q;
        return newHash;
    }

    public static void main(String[] args) {
        String text = "abcdefghi";
        String pattern = "efg";
        int q = 10;

        for (int i = 0; i <= text.length() - pattern.length(); i++) { // Fixing loop condition
            long textHash = countHash(text.substring(i, i + pattern.length()), q, pattern.length());
            if (textHash == countHash(pattern, q, pattern.length())) {
                if (text.substring(i, i + pattern.length()).equals(pattern)) {
                    System.out.println("Pattern found at index " + i);
                }
            }
            if (i < text.length() - pattern.length()) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + pattern.length()), pattern.length(), q);
            }
        }
    }
}
