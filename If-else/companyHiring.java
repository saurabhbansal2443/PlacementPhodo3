import java.util.*;

public class companyHiring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        char gender = sc.next().charAt(0); // m/f
        char status = sc.next().charAt(0); // u/m

        if (status == 'm' || status == 'M') {
            System.out.println("Hired");
        } else if ((gender == 'm' || gender == 'M') && age > 30) {
            System.out.println("Hired");
        } else if ((gender == 'f' || gender == 'F') && age > 25) {
            System.out.println("Hired");
        } else {
            System.out.println("Not Hired");
        }
    }
}
