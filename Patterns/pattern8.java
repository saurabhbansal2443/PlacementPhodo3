public class pattern8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) { // rows

            for (int j = 1; j <= i - 1; j++) { // spaces
                System.out.print("\t");
            }

            for (int j = 1; j <= n + 1 - i; j++) { // stars
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}
