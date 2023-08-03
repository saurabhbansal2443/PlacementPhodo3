public class percentage {
    public static void main(String[] args) {
        int sub1 = 89;
        int sub2 = 78;
        int sub3 = 90;
        int sub4 = 90;
        int sub5 = 90;

        int totalMarks  = sub1 + sub2 + sub3 + sub4 + sub5;

        int p = totalMarks/5;

        if(p>=90){
            System.out.println("Grade A");
        }else if ( p>=80){
            System.out.println("Grade B");
        }else if (p>=70){
            System.out.println("Grade C");
        }else if ( p >=60){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }


    }
}
