public class pattern15 {
    public static void main(String[] args) {
        int n = 7;

        int nst = 1;
        int nsp = n - 1;

        for (int i = 1; i <= 2 * n - 1; i++) {

            for (int j = 1; j <= nsp; j++) { // spaces1 (stars1)
                System.out.print("* ");
            }

            for (int j = 1; j <= nst; j++) { // (hollow diamond printing on boundary)

                if (j == 1 || j == nst) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int j = 1; j <= nsp; j++) { // spaces3 (stars3)
                System.out.print("* ");
            }

            System.out.println();

            if (i < n) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }

        }
    }
}
