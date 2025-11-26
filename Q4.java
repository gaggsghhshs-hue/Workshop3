import java.util.Scanner;
public class Q4
{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("enter your number");
    int number=input.nextInt();
    if(number%5==0 &&number%3==0 ){
        System.out.println(" divisible by 5 and 3");
    }
    else {
    System.out.println("doesn't divisible by 5 and 3");
    }
    
    
    
     }
}