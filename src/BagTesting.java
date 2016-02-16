import java.util.Scanner;

public class BagTesting {

   public static void main(String[] args) {
	   
	   //Scanner reader = new Scanner(System.in);
	   //reader.useDelimiter("\n");
	   String userInput = "";
	   BagInterface<BaseballCard> cardBag = new ArrayBag<>();
	   
	   while(!userInput.equals("quit"))
	   {
		   userInput = menu();
		   @SuppressWarnings("resource")
		   Scanner reader = new Scanner(System.in);
		   //menu option 1
		   if (userInput.equals("1"))
		   {
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
			   
			  // new BaseballCard(inputPlayer, inputPosition, inputTeam, inputPrice);
			   
			   while (count < inputCardDupeAmount)
			   {
				   addCard((new BaseballCard(inputPlayer, inputPosition, inputTeam, inputPrice)), cardBag);
				   System.out.println("card added.");
				   count++;
			   }
		   }
		   
		   //option 2
		   if(userInput.equals("2"))
		   {
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
			   
			   BaseballCard testCard = new BaseballCard(inputPlayer, inputPosition, inputTeam, inputPrice);
			   
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
		   
		   //option 3
		   if(userInput.equals("3"))
		   {
			   System.out.println("\n" + "Please input Player Name of the card you wish to find the value of: ");
			   String inputPlayer = reader.nextLine();
			   
			   System.out.println("\n"+ "Please input Player Position of the card you wish to find the value of: ");
			   String inputPosition = reader.nextLine();
			   
			   System.out.println("\n" + "Please input Player Team Name of the card you wish to find the value of: ");
			   String inputTeam = reader.nextLine();
			   
			   System.out.println("\n" + "Please input Card Price of the card you wish to find the value of: ");
			   double inputPrice = reader.nextDouble();
			   
			   //not supposed to be here
			   //System.out.println("\n" + "Please input Amount of duplicates for the card you wish to find the value of: ");
			   //int inputCardDupeAmount = reader.nextInt();
			   //int count = 0;
			   
			   BaseballCard testCard = new BaseballCard(inputPlayer, inputPosition, inputTeam, inputPrice);
			   int cardFrequency = cardBag.getFrequencyOf(testCard);
			   //BagInterface<BaseballCard> garbageBag = cardBag;
			   
			   
			   if(cardBag.contains(testCard))
			   {
				   /*while (count < cardFrequency)
				   {
					   cardBag.remove(testCard);
					   count++;
				   }*/
				   double preValue = testCard.getCardPrice();
				   double finalValue = preValue * cardFrequency;
				   System.out.println("\n" + "total value of the card and any duplicates if any is: $" + finalValue);
			   }
			   else
			   {
				   System.out.println("\n" + "Specified card either doesnt exist or you made mistake entering the values please try again.");
			   }
		   }
		   
		   //option 4
		   if (userInput.equals("4"))
		   {
			   System.out.println("\n" + "Please input Player Name of the card you wish to change the value of: ");
			   String inputPlayer = reader.nextLine();
			   
			   System.out.println("\n"+ "Please input Player Position of the card you wish to change the value of: ");
			   String inputPosition = reader.nextLine();
			   
			   System.out.println("\n" + "Please input Player Team Name of the card you wish to change the value of: ");
			   String inputTeam = reader.nextLine();
			   
			   System.out.println("\n" + "Please input Card Price of the card you wish to find the change of: ");
			   double inputPrice = reader.nextDouble();
			   
			   //System.out.println("\n" + "Please input Amount of duplicates for the card you wish to find the change of: ");
			  // int inputCardDupeAmount = reader.nextInt();
			   //int count = 0;
			   
			   BaseballCard testCard = new BaseballCard(inputPlayer, inputPosition, inputTeam, inputPrice);
			   
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
		   
		   //option 5
		   if (userInput.equals("5"))
		   {
			   //no idea
		   }
		   System.out.println("\n" + "output of entries in bag" + cardBag.getCurrentSize());
		   //System.out.println("\n" + "output of frequency" + cardBag.getFrequencyOf(testCard));
	   }
   }





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
	   //input.close();
	   return selection;
}



}

