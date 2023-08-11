public class Pattern3 {
    public static void main(String[] args) {

        int n = 7;

        for (int i = 1; i <= n; i++) {
            int print = i;
            int diff = n - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(print+ "\t");
                print = print + diff;
                diff--;
            }
            System.out.println();
        }
    }
}
