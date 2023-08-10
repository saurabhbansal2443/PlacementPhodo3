public class primeNumberInRange {
    public static void main(String[] args) {
        int n = 7 ;
        int m = 20 ;

        for(int i =n ;i<=m;i++){
            int k =i;
            boolean flag = true ;
            for(int j = 2 ;j<=k-1 ; j++ ){

                if(k%j==0){
                    flag = false;
                }
            }

            if(flag == true){
                System.out.println(k);
            }
        }
    }
}
