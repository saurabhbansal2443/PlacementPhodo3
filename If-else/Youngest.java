public class Youngest {
   public static void main(String[] args) {
    int r = 16 ;
    int s = 8 ;
    int a = 17 ;

      if(r<s && r<a){
        System.out.println(r);
      }else if ( s<r && s<a){
        System.out.println(s);
      }else if (a<r && a<s){
        System.out.println(a);
      }
   } 
}
