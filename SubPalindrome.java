public class Palindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                if (isPalindrome(substr)) {
                    System.out.println(substr);
                    count++;
                }
            }
        }

        System.out.println("Number of sub-palindromes: " + count);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
