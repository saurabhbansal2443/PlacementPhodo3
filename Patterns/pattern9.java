public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int nsp = 0;

        for (int i = 1; i <= 2 * n - 1; i++) { // rows

            for (int j = 1; j <= nsp; j++) { // spaces
                System.out.print("\t");
            }

            for (int j = 1; j <= nst; j++) { // stars
                System.out.print("*\t");
            }

            System.out.println();
            if (i < n) {
                nsp++;
                nst--;
            } else {
                nsp--;
                nst++;
            }

        }
    }
}
