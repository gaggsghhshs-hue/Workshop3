import java.util.Scanner;

public class POSITIVRorNEGATIVEorZERO
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    System.out.println("enter your number");
    int number=input.nextInt();
    if(number>0){
        System.out.println("positive");
    }
    else if(number==0){
    System.out.println("zero");
}
    
    else {
    System.out.println("negative");
    
    }
}}