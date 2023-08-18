public class pattern13 {
    public static void main(String[] args) {
        int n = 3;
        int nsp = 2 * n - 3;
        int nst = 1;
        for (int i = 1; i <= 2 * n - 1; i++) { // rows
                
            for (int j = 1; j <= nst; j++) { // stars1
                System.out.print("*\t");
            }
            for (int j = 1; j <= nsp; j++) { // spaces
                System.out.print("\t");
            }
            for (int j = 1; j <= nst; j++) { // stars2
                if (i == n && j == 1) {
                    j++;
                }
                System.out.print("*\t");
            }
            System.out.println();

            if (i < n) {
                nst++;
                nsp -= 2;
            } else {
                nst--;
                nsp += 2;
            }
        }
    }
}
