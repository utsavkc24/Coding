/*Valid anagram*/

public class Random {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.print(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }
}

