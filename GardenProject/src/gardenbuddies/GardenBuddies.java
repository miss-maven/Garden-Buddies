/*
 * Adv Java Garden project
 * Group M&MM's
 * 11/15/2023
 */

package gardenbuddies;

/**
 * adding a test comment
 * @author no u MccarthD3455
 */
import java.awt.HeadlessException;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane; 
import java.util.InputMismatchException;


public class GardenBuddies {
public static ArrayList<Plant> myGarden = new ArrayList<Plant>();
   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects  

   public static void printArrayList(ArrayList<Plant> myGarden) {
      int i;
      String plantNumber;
      for (i = 0; i < myGarden.size(); ++i) {
         plantNumber = "Plant "+(i+1) +" Information: ";
         myGarden.get(i).printInfo(plantNumber);
         System.out.println();
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
      String[] Choices = {"plant","flower"};
      String plantName;
      String plantCostinput;
      String flowerName;
      String flowerCostinput;
      String colorOfFlowers;
      boolean varified;
      float plantCost = 0;
      float flowerCost;
      float testValue;
      int isAnnual;
      int end;
      
      end = 0;
      
      while(end != 1){
          input = (String) JOptionPane.showInputDialog(null, "Is this a flower or a plant?"
                + "","Plant type", JOptionPane.QUESTION_MESSAGE, 
                null, Choices, Choices[0]);
         
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
         switch (input){
                 case "flower":
           Flower myFlower = new Flower();
           try
           {
           plantName = JOptionPane.showInputDialog("Please enter flower name: ");
           myFlower.setPlantName(plantName);
           }
           catch(HeadlessException InputError)
           {
            JOptionPane.showMessageDialog(null, "Cannot be blank please try again"); 
           }
           int go = 1;
           while(go == 1){
           input = JOptionPane.showInputDialog("Please enter flower cost: ");
           
           try 
           {
              plantCost = Float.parseFloat(input);
              go = 0;
           }
           catch(NumberFormatException InputError)
           {
               JOptionPane.showMessageDialog(null, "Cannot use letters or symbols. Please try again!");
           }
           }
           
           myFlower.setPlantCost(plantCost);
           isAnnual = JOptionPane.showConfirmDialog(null,"is the flower an annual flower","",JOptionPane.YES_NO_OPTION);
           myFlower.setPlantType(isAnnual);
           try
           {
           colorOfFlowers = JOptionPane.showInputDialog("Please enter flower color.");
           myFlower.setColorOfFlowers(colorOfFlowers);
           }
           catch(InputMismatchException InputError)
           {
           JOptionPane.showMessageDialog(null, "Cannot be blank please try again");
           }
           myGarden.add(myFlower);
           break;
           
           case ("plant"):
           Plant myPlant = new Plant();
            try
           {
           plantName = JOptionPane.showInputDialog("Please enter plant name: ");
           myPlant.setPlantName(plantName);
           }
           catch(Exception InputError)
           {
            JOptionPane.showMessageDialog(null, "Cannot be blank please try again"); 
           }
           go = 1;
           while(go == 1){
           input = JOptionPane.showInputDialog("Please enter plant cost: ");
           
           try 
           {
              plantCost = Float.parseFloat(input);
              go = 0;
           }
           catch(NumberFormatException InputError)
           {
               JOptionPane.showMessageDialog(null, "Cannot use letters or symbols. Please try again!");
           }
           }
           
           myPlant.setPlantCost(plantCost);
           myGarden.add(myPlant);
         }
      
                 
         
         
         end = JOptionPane.showConfirmDialog(null,"Add another?","",JOptionPane.YES_NO_OPTION);
      // TODO: Call the method printArrayList to print myGarden
      }
      printArrayList(myGarden);
      System.out.print(myGarden); 
      //print();
      Invoice.printInvoice(myGarden);
   }
//<editor-fold defaultstate="collapsed" desc="print()">
//   public static void print()
//   {
//    JFrame message = new JFrame();
//      try{
//       PrintWriter outputFile = new PrintWriter("myGarden.txt");
//       int e = 0;
//       for(Object obj : myGarden)
//       {
//         e++;
//         outputFile.println("Plant " + e + " Information:");
//         if(obj.getClass() == Plant.class)
//         {
//            Plant newPlant = (Plant) obj;
//            outputFile.println("    Plant name: " + newPlant.getPlantName());
//            outputFile.println("    Cost $" + newPlant.getPlantCost());
//         }
//         if(obj.getClass() == Flower.class)
//         {
//            Flower newFlower = (Flower) obj;
//            outputFile.println("    Plant name: " + newFlower.getPlantName());
//            outputFile.println("    Cost $" + newFlower.getPlantCost());
//            outputFile.println("    Annual: " + newFlower.getPlantType());
//            outputFile.println("    Color of flowers: " + newFlower.getColorOfFlowers());
//         }
//       }
//       outputFile.close();
//       }catch (IOException e)
//       {
//           JOptionPane.showMessageDialog(message, "An Error occured.");
//
//       }
//  }
//</editor-fold>
}