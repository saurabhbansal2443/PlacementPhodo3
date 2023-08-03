import java.util.*;
public class SteelGrade {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int h = sc.nextInt();
      double c = sc.nextDouble();
      int ts = sc.nextInt();


        if(h>50 && c<0.7 && ts>5600){
            System.out.println("Grade 10");
        }else if (h>50 && c<0.7){
            System.out.println("Grade 9");
        }else if ( c<0.7 && ts>5600){
            System.out.println("Grade 8");
        }else if(h>50 && ts>5600){
            System.out.println("Grade 7");
        }else if ( h>50 || c<0.7 || ts>5600){
            System.out.println("Grade 6");
        }else{
            System.out.println("Grade 5");
        }

    }
}
