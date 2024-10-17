public class MissingCharacters {
    public static void main(String[] args) {
        char[] chars = {'a', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's', 't', 'u', 'v', 'x', 'z'};

        for (char c = 'a'; c <= 'z'; c++) {
            boolean found = false;
            for (char ch : chars) {
                if (c == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(c + ",");
            }
        }
    }
}

