public class pattern12{
    public static void main(String[] args) {
        int n = 7 ;

        int nst = 1;
        int nsp = n-1;

        for(int i=1 ; i<=2*n-1;i++){ // rows

            for(int j=1;j<=nsp ; j++){ // space
                System.out.print("\t");
            }

            for(int j=1;j<=nst ; j++){ // stars
                System.out.print("*\t");
            }

            System.out.println();
            if(i<n){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }

        }
    }
}