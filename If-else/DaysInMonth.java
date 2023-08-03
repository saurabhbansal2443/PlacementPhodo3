public class DaysInMonth {
    public static void main(String[] args) {
        int n = 6;     // n is month 
        int y = 2004; // y is year 

        if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12){
            System.out.println("31 Days");
        }else if ( n==4 || n==6 || n==9 || n==11){
            System.out.println("30 Days");
        }else if ( n==2 && y%4==0){
            System.out.println("29 Days");
        }else if ( n==2){
            System.out.println("28 Days");
        }
    }
}
