/* Programmer: Curtis Chippeway
 * The purpose of this class is to run the Main program.
 * The sources used were the class notes from Kenward Chin and 
 * http://stackoverflow.com/a/22277310 to have the user menu inside of a method 
 */
import java.util.Scanner;

public class BagTesting {

   public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	   
	   String userInput = "";
	   //declaring a bag bag object for BaseballCard objects
	   BagInterface<BaseballCard> cardBag = new ArrayBag<>();
	   
	   //loop to stay in the user menu until user quits
	   while(!userInput.equals("quit"))
	   {
		   //uses the menu method to create a user menu and assigns it to userInput string
		   userInput = menu();
		   @SuppressWarnings("resource")
		   Scanner reader = new Scanner(System.in);
		   
		   //user menu option 1
		   if (userInput.equals("1"))
		   {
			 //user card information input
			   System.out.println("\n" + "Please input Player Name: ");
			   String inputPlayer = reader.nextLine();			   
			   System.out.println("\n"+ "Please input Player Position: ");
			   String inputPosition = reader.nextLine();			   
			   System.out.println("\n" + "Please input Player Team Name: ");
			   String inputTeam = reader.nextLine();		   
			   System.out.println("\n" + "Please input Card Price: ");
			   double inputPrice = reader.nextDouble();			   
			   System.out.println("\n" + "Please input Amount of duplicates for this card: ");
			   int inputCardDupeAmount = reader.nextInt();
			   int count = 0;
			   
			   //if there's more than one of the same card being entered
			   //loop until all desired copies are in the bag
			   while (count < inputCardDupeAmount)
			   {
				   addCard((new BaseballCard(inputPlayer, inputPosition, inputTeam, inputPrice)), cardBag);
				   count++;
			   }
		   }
		   
		   //user menu option 2
		   if(userInput.equals("2"))
		   {
			 //user card information input
			   System.out.println("\n" + "Please input Player Name of the card you wish to remove: ");
			   String inputPlayer = reader.nextLine();
			   System.out.println("\n"+ "Please input Player Position of the card you wish to remove: ");
			   String inputPosition = reader.nextLine();			   
			   System.out.println("\n" + "Please input Player Team Name of the card you wish to remove: ");
			   String inputTeam = reader.nextLine();			   
			   System.out.println("\n" + "Please input Card Price of the card you wish to remove: ");
			   double inputPrice = reader.nextDouble();			   
			   System.out.println("\n" + "Please input Amount of duplicates for the card you wish to remove: ");
			   int inputCardDupeAmount = reader.nextInt();
			   int count = 0;
			   //this line assigns the card the user wants to manipulate to an object so we can access it
			   BaseballCard testCard = new BaseballCard(inputPlayer, inputPosition, inputTeam, inputPrice);
			   
			   //if the bag has the card the user wants to remove loop until desired amount of copies is removed
			   //else throw error
			   if(cardBag.contains(testCard) && inputCardDupeAmount >= 0)
			   {
				   while (count < inputCardDupeAmount)
				   {
					   cardBag.remove(testCard);
					   count++;
				   }
			   }
			   else
			   {
				   System.out.println("\n" + "Specified card either doesnt exist or you made mistake entering the values please try again.");
			   }
		   }
		   
		   //user menu option 3
		   if(userInput.equals("3"))
		   {
			 //user card information input
			   System.out.println("\n" + "Please input Player Name of the card you wish to find the value of: ");
			   String inputPlayer = reader.nextLine();			   
			   System.out.println("\n"+ "Please input Player Position of the card you wish to find the value of: ");
			   String inputPosition = reader.nextLine();		   
			   System.out.println("\n" + "Please input Player Team Name of the card you wish to find the value of: ");
			   String inputTeam = reader.nextLine();			   
			   System.out.println("\n" + "Please input Card Price of the card you wish to find the value of: ");
			   double inputPrice = reader.nextDouble();
			   
			   //this line assigns the card the user wants to manipulate to an object so we can access it
			   BaseballCard testCard = new BaseballCard(inputPlayer, inputPosition, inputTeam, inputPrice);
			   
			   int cardFrequency = cardBag.getFrequencyOf(testCard);
			   
			   //if the bag contains the card the user wishes to find the total value of
			   //it gets the value of the card and multiplies it by how many copies there
			   //are in the bag else throws error
			   if(cardBag.contains(testCard))
			   {
				   double preValue = testCard.getCardPrice();
				   double finalValue = preValue * cardFrequency;
				   System.out.println("\n" + "total value of the card and any duplicates if any is: $" + finalValue);
			   }
			   else
			   {
				   System.out.println("\n" + "Specified card either doesnt exist or you made mistake entering the values please try again.");
			   }
		   }
		   
		   //user menu option 4
		   if (userInput.equals("4"))
		   {
			   //user card information input
			   System.out.println("\n" + "Please input Player Name of the card you wish to change the value of: ");
			   String inputPlayer = reader.nextLine();			   
			   System.out.println("\n"+ "Please input Player Position of the card you wish to change the value of: ");
			   String inputPosition = reader.nextLine();			   
			   System.out.println("\n" + "Please input Player Team Name of the card you wish to change the value of: ");
			   String inputTeam = reader.nextLine();			   
			   System.out.println("\n" + "Please input Card Price of the card you wish to find the change of: ");
			   double inputPrice = reader.nextDouble();
			   
			   //this line assigns the card the user wants to manipulate to an object so we can access it
			   BaseballCard testCard = new BaseballCard(inputPlayer, inputPosition, inputTeam, inputPrice);
			   
			   //if the bag contains the card the user wishes to change the price value of
			   //ask user for the new price and then assign it to that card else throw error
			   if(cardBag.contains(testCard))
			   {
				   System.out.println("\n" + "Please input the new Card Price: ");
				   double inputNewPrice = reader.nextDouble();
				   testCard.setCardPrice(inputNewPrice);
				   System.out.println("\n" + "Succesfully changed price the price is now: $" + testCard.getCardPrice());
			   }
			   else
			   {
				   System.out.println("\n" + "Specified card either doesnt exist or you made mistake entering the values please try again.");
			   }
		   }
		   
		   //user menu option 5
		   if (userInput.equals("5"))
		   {
			   int bagSize = cardBag.getCurrentSize();
			   
			   //not finished but supposed to loop out all cards from original bag into new bag
			   //and then when removing from new bag you check if you've seen that particular card before
			   //if not store it and add a 1 value to it and then add it back to the original bag
			   //before the loop starts again
			   if(bagSize > 0)
			   {
				   while(bagSize > 0)
				   {
					   BagInterface<BaseballCard> copyBag = new ArrayBag<>();
					   BaseballCard cardObj = cardBag.remove();
					   copyBag.add(cardObj);
				   }
			   }	   
			   
		   }
	   }
   }




//method to add cards to the bag
private static void addCard(BaseballCard aCard, BagInterface<BaseballCard> cardBag)
{
	if (cardBag.add(aCard))
	{
		System.out.println("added a " + aCard.getPlayerName() + ".");		
	}
	else
	{
		System.out.println("tried to add a " + aCard.getPlayerName() + ", but couldn't");
	}
	
}

//method for creating a user interactive menu
private static String menu()
{
	String selection;
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	
	System.out.println("Choose from the options listed below, or type quit to close the program. "+ "\n");
	   System.out.println("1) Add an Baseball Card to the bag." + "\n");
	   System.out.println("2) Remove a Baseball Card and duplicates if specified." + "\n");
	   System.out.println("3) Find the total value of a Baseball card including duplicates." + "\n");
	   System.out.println("4) Change the price of a Baseball Card." + "\n");
	   System.out.println("5) Find all cards in the bag and how many duplicates you have." + "\n");
	   System.out.println("Please Input the number for the option you wish to use: ");
	   
	   selection = input.nextLine();
	   return selection;
}



}

