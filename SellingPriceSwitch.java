import java.util.Scanner;

public class SellingPriceSwitch {
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

        
        switch (category) {

            case 'A':
                discount = 60;  
                break;

            case 'B':
                discount = 40;
                break;

            case 'C':
                discount = 20; 
                break;
               
            case 'D':
                discount = 10;
                break;

            default:
                System.out.println("Invalid category!");
                return;
        }

        
        sp = mp - (mp * discount / 100);

    
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Selling Price: " + sp);
    }
}
