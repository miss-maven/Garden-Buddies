/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gardenproject;

/**
 * adding a test comment
 * @author MccarthD3455
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFrame; 


public class GardenProject {
public static ArrayList<Plant> myGarden = new ArrayList<Plant>();
   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects  
   public static boolean varification(String input){
       //<editor-fold defaultstate="collapsed" desc="Verification code">
       int i;
       char checker;
       boolean varified;
       boolean digitVarafied = true;
       for(i = 0; i < input.length();i++){
           checker = input.charAt(i);
           varified = Character.isDigit(checker);
           if(varified == false){
               digitVarafied = false;
           }   
       }
       if (input.equals(""))
           {
               digitVarafied = false;
           }
       return digitVarafied;
   }
   
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
      int plantCost = 0;
      int flowerCost;
      int isAnnual;
      int end;
      
      
      end = 0;
      
      while(end != 1){
          input = (String) JOptionPane.showInputDialog(null, "flower or plant?"
                + "","Plant type", JOptionPane.QUESTION_MESSAGE, 
                null, Choices, Choices[0]);
         
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
         switch (input){
                 case "flower":
           Flower myFlower = new Flower();
           plantName = JOptionPane.showInputDialog("Please enter flower name");
           myFlower.setPlantName(plantName);
            varified = false;
        while(varified == false){
            while(varified == false){
                input = JOptionPane.showInputDialog("Please enter plant cost.");
                varified = varification(input);
                if(varified == false){
                    JOptionPane.showMessageDialog(null, "A letter or symbol was entered.");
                }
             plantCost = Integer.parseInt(input);
            if(plantCost <= 0){
                JOptionPane.showMessageDialog(null, "Number cannot be zero or less.");
                varified = false;
            }    
            }
        }
            
           myFlower.setPlantCost(plantCost);
           isAnnual = JOptionPane.showConfirmDialog(null,"is the flower an annual flower","",JOptionPane.YES_NO_OPTION);
           myFlower.setPlantType(isAnnual);
           colorOfFlowers = JOptionPane.showInputDialog("Please enter flower color.");
           myFlower.setColorOfFlowers(colorOfFlowers);
           myGarden.add(myFlower);
           break;
           
           case ("plant"):
           Plant myPlant = new Plant();
           plantName = JOptionPane.showInputDialog("Please enter plant name.");
           myPlant.setPlantName(plantName);
           varified = false;
        while(varified == false){
            while(varified == false){
                input = JOptionPane.showInputDialog("Please enter plant cost.");
                varified = varification(input);
                if(varified == false){
                    JOptionPane.showMessageDialog(null, "A letter or symbol was entered.");
                }

            }
                            plantCost = Integer.parseInt(input);
            if(plantCost <= 0){
                JOptionPane.showMessageDialog(null, "Number cannot be zero or less.");
                varified = false;
            }
        }
             
           myPlant.setPlantCost(plantCost);
           myGarden.add(myPlant);
         }
                 
         
         
         end = JOptionPane.showConfirmDialog(null,"Go again?","",JOptionPane.YES_NO_OPTION);
      }
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
      System.out.print(myGarden); 
      print();
   }
   public static void print()
   {
    JFrame message = new JFrame();
      try{
       PrintWriter outputFile = new PrintWriter("myGarden.txt");
       int e = 0;
       for(Object obj : myGarden)
       {
         e++;
         outputFile.println("Plant " + e + " Information:");
         if(obj.getClass() == Plant.class)
         {
            Plant newPlant = (Plant) obj; 
            outputFile.println("    Plant name: " + newPlant.getPlantName());
            outputFile.println("    Cost: " + newPlant.getPlantCost());
         }
         if(obj.getClass() == Flower.class)
         {
            Flower newFlower = (Flower) obj; 
            outputFile.println("    Plant name: " + newFlower.getPlantName());
            outputFile.println("    Cost: " + newFlower.getPlantCost());
            outputFile.println("    Annual: " + newFlower.getPlantType());
            outputFile.println("    Color of flowers: " + newFlower.getColorOfFlowers());
         }
       }   
       outputFile.close();
       }catch (IOException e)
       {
           JOptionPane.showMessageDialog(message, "An Error occured.");
       
       }   
   }
}
