public class Pascals {
    public static void main(String[] args) {
        int a = 4;  
        int b = 1; 
      
        for (int i = 1; i <= a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print("   "); 
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i % 2 == 0) { 
                    System.out.print((b + (2 * i - 2) - (j - 1)) + "  ");
                } else { 
                    System.out.print(b + "  ");
                    b++;
                }
            }
            System.out.println();
            if (i % 2 == 0) {
                b += (2 * i); 
            }
        }
    }
}