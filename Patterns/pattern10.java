public class pattern10{
    public static void main(String[] args) {
        int n = 5 ;

        int nst = 1;
        int nsp = n-1 ;

        for(int i=1 ; i<=n;i++){ // rows

            for(int j=1;j<=nsp ; j++){ // space
                System.out.print("\t");
            }

            for(int j=1;j<=nst ; j++){ // stars
                System.out.print("*\t");
            }

            System.out.println();
            nsp--;
            nst+=2;

        }
    }
}