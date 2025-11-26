import java.util.Scanner;

public class SellingPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float mp;           
        char category;        
        float discount = 0;   
        float sp;             

        
        System.out.print("Enter the marked price: ");
        mp = sc.nextFloat();

        
        System.out.print("Enter the category (A/B/C/D): ");
        category = sc.next().charAt(0);

        
        if (category == 'A' || category == 'a') {
            discount = 60;     
        }
        else if (category == 'B' || category == 'b') {
            discount = 40;    
        }
        else if (category == 'C' || category == 'c') {
            discount = 20;   
        }
         else if (category == 'D' || category == 'c') {
            discount = 10;   
        }
        else {
            System.out.println("Invalid category!");
            return;
        }

    
        sp = mp - (mp * discount / 100);
        
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Selling Price: " + sp);
    }
}
