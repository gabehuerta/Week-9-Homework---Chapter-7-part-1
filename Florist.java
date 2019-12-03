import java.util.Scanner;
public class Florist{

	private String name;
	private double cost;

	public Florist(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
	}
	public String getName()
	{
		return name;
	}
	public double getCost()
	{
		return cost;
	}
	public String toString()
	{
		return name + ":$" + cost;
	}
	public static void main(String[] args)
	{
		String flowerName;
        	int quantity;
        	double totalCost;
        	int correspondingIndex = 0;

        	Scanner keyboard = new Scanner(System.in);

       	 	Florist[] flowers = new Florist[5];
        	flowers[0] = new Florist("Petunia", .50);
        	flowers[1] = new Florist("Pansy", .75);
        	flowers[2] = new Florist("Rose", 1.50);
        	flowers[3] = new Florist("Violet", .50);
        	flowers[4] = new Florist("Carnation", .80);
        	
		System.out.println("The names of the flowers available are ... ");
        
		for (int count = 0; count < flowers.length; count++)
		{
            		System.out.println(flowers[count]);
		}

        	System.out.print("Enter the valid name of flower: ");
        	flowerName = keyboard.nextLine();

        	System.out.print("Enter the number of flowers: ");
        	quantity = keyboard.nextInt();
		
        	for (int index = 0; index < flowers.length; index++) 
		{
           		if (flowers[index].getName().equalsIgnoreCase(flowerName)) 
			{
               			correspondingIndex = index;
                		break;
           		}
        	}
        	totalCost = flowers[correspondingIndex].getCost() * quantity;

        	System.out.println("\nSelected flower: " + flowerName);
        	System.out.println("Number of flowers desired: " + quantity);
        	System.out.println("Cost of one flower: $" + String.format("%.2f", flowers[correspondingIndex].getCost()));
        	System.out.println("\nTotal cost of sale: $" + String.format("%.2f", totalCost));
    }

}