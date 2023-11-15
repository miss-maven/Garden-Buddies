/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantarraylistexample;

import javax.swing.JOptionPane;

/**
 *
 * @author tompkint0208
 */
public class Flower extends Plant {

   private String isAnnual;
   private String colorOfFlowers;

   public void setPlantType(int userIsAnnual) {
       if (userIsAnnual == 0){
           isAnnual = "Yes";
       }
       else{
           isAnnual = "No";
       }
   }

   public String getPlantType(){
      return isAnnual;
   }

   public void setColorOfFlowers(String userColorOfFlowers) {
      colorOfFlowers = userColorOfFlowers;
   }

   public String getColorOfFlowers(){
      return colorOfFlowers;
   }
   
   @Override
   public void printInfo(String plantNumber){
      String newline = System.lineSeparator();  
      JOptionPane.showMessageDialog(null,plantNumber + newline + "   Flower name: " + plantName + 
              newline + "   Cost: " + plantCost + newline + "   Annual: " + 
              isAnnual + newline + "   Color of flowers: " + colorOfFlowers);
      /*System.out.println("   Flower name: " + plantName);
      System.out.println("   Cost: " + plantCost);
      System.out.println("   Annual: " + isAnnual);
      System.out.println("   Color of flowers: " + colorOfFlowers);*/
   }
}
