public class primeNumber {
    public static void main(String[] args) {
        int n = 7;

        boolean flag = true ;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                flag = false;
            } 
        }

        System.out.println(flag);
    }
}
