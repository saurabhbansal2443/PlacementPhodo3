import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char sign = sc.next().charAt(0);
        int b = sc.nextInt();

        if(sign == '+'){
            System.out.println(a+b);
        }else if ( sign == '-'){
            System.out.println(a-b);
        }else if ( sign == '*'){
            System.out.println(a*b);
        }else if (sign == '/'){
            System.out.println(a/b);
        }
    }
}
