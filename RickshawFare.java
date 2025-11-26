
/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RickshawFare
{
 public static void main(String[] args){
    double startingFee = 50.0;
    double costPerkilometer = 20.0;
    double costPerminute = 2.0;
    double longdistance= 5.0;
    double localCustomerdiscount = 0.10;
    double nightTimeServiceCharge = 0.50;
    
    Scanner talkToDriver = new Scanner(System.in);
     System.out.println("--Welcome to Girish Rickshaw Fare---");
     System.out.println("Lets calculate the customer fare as per trip details");
      System.out.println("how far was the trip (km):");
      double tripDistance = talkToDriver.nextDouble();
      System.out.println("how long did the trip take(minute):");
      double tripDuration = talkToDriver.nextDouble();
      System.out.println("Is customer local? (type 'true' or 'false'):");
      boolean isCustomerlocal = talkToDriver.nextBoolean();
      System.out.println("did the trip happen during night? (type 'true' or 'false'):");
      boolean isItNight = talkToDriver.nextBoolean();
      
      double initialPrice = startingFee
                           + (tripDistance * costPerkilometer)
                           + (tripDuration * costPerminute);
       double currentTotalFare = initialPrice;
       
       double nightFee = isItNight ? (initialPrice * nightTimeServiceCharge): 0.0;
       currentTotalFare += nightFee;
       
      double moneysaved = 0.0;
        
       if (isCustomerlocal && (tripDistance > longdistance)){
           moneysaved = initialPrice * localCustomerdiscount; //ternary operator
           currentTotalFare -= moneysaved;
       }
       
     System.out.println("\n-----------------------------");
     System.out.println("Initial Fare: Rs"+ initialPrice);
     System.out.println("Night Fee: Rs"+ nightFee);
     System.out.println("Local Discount: Rs"+ moneysaved);
     System.out.println("-----------------------------");
     System.out.println("\n----Final Fare to Customer----");
     
     
     
       
       
                           

      

    
    
    
    
    
    
    
    
    
    }
    
    
}