/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gardenbuddies;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * method to print info to a file in invoice format 
 * !!need to check if variables match 
 */
public class Invoice {
public static void main(String[] args) 
{
}

public static void printInvoice(ArrayList<Plant> myGarden) 
{
    int p = 0;
    int f = 0;
 //String filename = "gardenbud.txt";
try 
{
PrintWriter outputFile = new PrintWriter("gardenbud.txt");
outputFile.println("--------------------------------------------------");
outputFile.println();
outputFile.println("------------- Garden Buddies Invoice-------------");
outputFile.println();
outputFile.println("------------- Date: " + LocalDate.now()+ "--------------------");
outputFile.println();
outputFile.println("--------------------------------------------------");
for(Object obj: myGarden)
{
    
 if (obj.getClass() == Plant.class)
 {
     p++;
     Plant myPlant = (Plant) obj;
     outputFile.println();
     outputFile.println("Plant " + p + ": ");
     outputFile.println();
     outputFile.println("Name: " + myPlant.getPlantName());
     outputFile.println();
     outputFile.println("Cost: " + myPlant.getPlantCost()); 
     outputFile.println();
 }
 if(obj.getClass() == Flower.class)
 {
     Flower myFlower = (Flower) obj;
     f++;
     outputFile.println();
     outputFile.println("Flower " + f + ": ");
     outputFile.println();
     outputFile.println("Name: " + myFlower.getPlantName());
     outputFile.println();
     outputFile.println("Color: " + myFlower.getColorOfFlowers()); 
     outputFile.println();
     outputFile.println("Cost: " + myFlower.getPlantCost()); 
     outputFile.println();
     outputFile.println("Annual: " + myFlower.getPlantType());
     outputFile.println();
 }
 
}
outputFile.println();
outputFile.println("------- Thank you for using Garden Buddies! -------");
outputFile.close();
//System.out.println("Plant/flower information added to invoice");
JOptionPane.showMessageDialog(null, "Plant/Flower information added to invoice");
}
catch (IOException e) 
{
JOptionPane.showMessageDialog(null, "Error no printy to file :( " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

}
}
