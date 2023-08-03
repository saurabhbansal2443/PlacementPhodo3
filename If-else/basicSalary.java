public class basicSalary {
    public static void main(String[] args) {
        int bs = 9000;


        if( bs<=10000){
            System.out.println(2*bs);
        }else if ( bs<=20000){
            System.out.println(2.15*bs);
        }else{
            System.out.println(2.25*bs);
        }
    }
}
