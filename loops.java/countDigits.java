public class countDigits {
    public static void main(String[] args) {
        int n = 123456;

        int count = 0;

        while (n > 0) {

            int d = n % 10;

            count = count + d;

            n = n / 10;

        }

        System.out.println(count);
    }
}
