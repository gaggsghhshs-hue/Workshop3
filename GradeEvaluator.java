


    import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade:\t");
        int grade = sc.nextInt();

        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("\n-------------------------");
        System.out.println("Your Grade:\t" + grade);
        System.out.println("Result:\t" + result);
        System.out.println("---------------------------\n");
    }
}

