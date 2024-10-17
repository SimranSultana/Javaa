public class PascalTriangle {
    public static void main(String[] args) {
        int a = 4; 
        int b = 1; 

        for (int i = 1; i <= a; i++) {
           
            for (int j = b; j > i; j--) {
                System.out.print("   "); 
            }

            if (i % 2 == 1) { 
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(b + "  ");
                    b++;
                }
            } else { 
                int temp = b + (2 * i - 1) - 1; 
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(temp + "  ");
                    temp--;
                }
                b += (2 * i - 1); 
            }

            System.out.println();
        }
    }
}