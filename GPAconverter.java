import java.util.Scanner;
public class GPAconverter
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter your GPA range from (0.0 to 4.0)");
        double gpa = sc.nextDouble();
        if(gpa>4 && gpa<0){
            System.out.println("invalid");
        }
        else if(gpa>3.6 && gpa<=4){
        
        System.out.println("grade is A+");
        }
        else if (gpa>3.2 && gpa<=3.6){
        System.out.println("grade is A");
        }
        else if (gpa>2.8 && gpa<=3.2){
        System.out.println("grade is B+");
        }
        else if (gpa>2.4 && gpa<=2.8){
        System.out.println("grade is B");
        }
        else if (gpa>2.0 && gpa<=2.4){
        System.out.println("grade is C+");
        }else if (gpa>1.6 && gpa<=2.0){
        System.out.println("grade is C");
        }
        else if (gpa>1.2 && gpa<=1.6){
        System.out.println("grade is D+");
        }
        else if (gpa>0.8 && gpa<=1.2){
        System.out.println("grade is D");
        }
        else{
          System.out.println("better luck next time GG ");  
        }
    
        }
}