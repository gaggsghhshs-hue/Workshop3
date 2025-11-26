
import java.util.Scanner;
public class Divisibleby3or5
{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("enter your number");
    int number=input.nextInt();
    if(number%5==0){
        if(number%3==0){
    System.out.println("the number is divisible by both 3 and 5");
}
else {

System.out.println("the number is divisible by 5 but not by 3");

}
    }
    else {
    System.out.println("doesn't divisible by 5 and 3");
    }
    
    
    
     }
}