public class Traingles {
    public static void main(String[] args) {
        int a = 71 ;
        int b = 17 ;
        int c = 7 ;

        // if( a==b ){
        //     if( b==c ){
        //         System.out.println("Equilateral");
        //     }else {
        //         System.out.println("Iso");
        //     }
        // }else if ( b==c ){
        //     System.out.println("ISo");
        // }else if ( a==c ){
        //     System.out.println("ISo");
        // }else{
        //     System.out.println("Scalene");
        // }

        if( a==b && b==c ){
            System.out.println("Equilateral");
        }else if ( a==b || b==c || c==a){
            System.out.println("Iso");
        }else{
            System.out.println("Sca");
        }
    }
}
