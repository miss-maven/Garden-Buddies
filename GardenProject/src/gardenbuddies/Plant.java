/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gardenbuddies;

import javax.swing.JOptionPane;

/**
 *
 * @author tompkint0208
 */
public class Plant {
   protected String plantName;
   protected float plantCost;

   public void setPlantName(String userPlantName) {
      plantName = userPlantName;
   }

   public String getPlantName() {
      return plantName;
   }

   public void setPlantCost(float userPlantCost) {
      plantCost = userPlantCost;
   }

   public float getPlantCost() {
      return plantCost;
   }

   public void printInfo(String plantNumber) {
       String newline = System.lineSeparator();  
       JOptionPane.showMessageDialog(null,plantNumber + newline + "   Flower name: " + plantName + 
              newline + "   Cost: " + plantCost);
       /*System.out.println("   Plant name: " + plantName);
       System.out.println("   Cost: " + plantCost);*/
   }
}
