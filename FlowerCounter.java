import java.util.Scanner;

public class FlowerCounter
{
public static void main(String[] args){
  
       String[] flowernames = new String[5];
       flowernames[0] = "petunia";
       flowernames[1] = "pansy";
       flowernames[2] = "rose";
       flowernames[3] = "violet";
       flowernames[4] = "carnation";
     
       double[] flowercost = new double[5];
       flowercost[0]=50;
       flowercost[1]=75;
       flowercost[2]=1.50;
       flowercost[3]=50;
       flowercost[4]=80;
     
       String[] currency = new String[5];
       currency[0]="\u00A2";
       currency[1]="\u00A2";
       currency[2]="$";
       currency[3]="\u00A2";
       currency[4]="\u00A2";
      
       Scanner keyboard = new Scanner(System.in);
       System.out.println("\nEnter the name of the flower desired: ");
       String flower = keyboard.nextLine();
       boolean found = false;
       int index = 0;
  
       for(int i = 0 ; i < 5 ; i++)
       {
           if(flower.toLowerCase().equals(flowernames[i].toLowerCase()))
           {
               index=i;
               found=true;
           }      
       }

       if(found)
       {
           System.out.println("\nEnter quantity desired: ");
           double quant = keyboard.nextDouble();
           double cost = quant*flowercost[index];
           System.out.println("\nTotal cost of sale is: "+cost+currency[index]);
       }

       else
           System.out.println("\nFlower not found.");
   }

}




