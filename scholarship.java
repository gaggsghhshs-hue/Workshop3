
import java.util.Scanner;
public class scholarship
{
     public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
         System.out.println("enter your GPA ");
         double gpa = sc.nextDouble();
         System.out.println("enter your attendance percenatge(1-100)");
         float attendance = sc.nextFloat();
         System.out.println("enter your attitude score from (1-10)");
         int attitudescore = sc.nextInt ();
        if(gpa >= 3.2){
            if(attendance > 80){
            if (attitudescore < 5){
           System.out.println("your are  eiligble for scholarship");
            }
            else {
            
            System.out.println("your are not eiligble for scholarship");}
            }
            else{
            System.out.println("your are not eiligble for scholarship");}
                 
        
        }
        else {
        System.out.println("your are not eiligble for scholarship");
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}