public class threeNumberMax {
    public static void main(String[] args) {
        int a = 16;
        int b = 81;
        int c = 900;

        if(a>b){

             if(a>c){
                    System.out.println(a);
             }else {
                System.out.println(c);
             }
        }else if(b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
