import java.util.Scanner;

public class A0toA5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                  
               
        char category;
    
        
    
        System.out.print("Enter the category (A/B/C/D/E/F): ");
        category = sc.next().charAt(0);

        
        switch (category) {

            case 'A':
                System.out.print("A0: 841 x 1189 mm (33.1 x 46.8 inches");
                break;

            case 'B':
                System.out.print("A1: 594 x 841 mm (23.4 x 33.1 inches)");
                
                break;

            case 'C':
               System.out.print("A2: 420 x 594 mm (16.5 x 23.4 inches)");
            break;
               
            case 'D':
                System.out.print("A3: 297 x 420 mm (11.7 x 16.5 inches");
                
                break;
                 case 'E':
                System.out.print("A4: 210 x 297 mm (8.3 X 11.7 inches");
                
                break;
                 case 'F':
                System.out.print("A5: 148 x 210 mm (5.8 x 8.3 inches");
                
                break;

            default:
                System.out.println("Invalid category!");
                return;
        }
            System.out.println("");
    }
}
