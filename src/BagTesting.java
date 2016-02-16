import java.util.Scanner;

public class BagTesting {

   public static void main(String[] args) {
	   
	   @SuppressWarnings("resource")
	   Scanner reader = new Scanner(System.in);
	   //reader.useDelimiter("\n");
	   String userInput = "";
	   BagInterface<BaseballCard> cardBag = new ArrayBag<>();
	   
	   while(!userInput.equals("quit"))
	   {
		   System.out.println("Choose from the options listed below, or type quit to close the program. "+ "\n");
		   System.out.println("1) Add an Baseball Card to the bag." + "\n");
		   System.out.println("2) Remove a Baseball Card and duplicates if specified." + "\n");
		   System.out.println("3) Find the total value of a Baseball card including duplicates." + "\n");
		   System.out.println("4) Change the price of a Baseball Card." + "\n");
		   System.out.println("5) Find all cards in the bag and how many duplicates you have." + "\n");
		   System.out.println("Please Input the number for the option you wish to use: ");
		   
		   userInput = reader.nextLine();
		   
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
				   cardBag.add(new BaseballCard(inputPlayer, inputPosition, inputTeam, inputPrice));
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
			   System.out.println("\n" + "Please input Amount of duplicates for the card you wish to find the value of: ");
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
				   double preValue = testCard.getCardPrice();
				   double finalValue = preValue * count;
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
	   
	   //BaseballCard card1 = new BaseballCard("curtis", "pitcher", "mariners", 60);
	   

	  /* BaseballCard n1 = new BaseballCard();
       BaseballCard n2 = new BaseballCard();
       
       System.out.println("Is bag empty? " + cardBag.isEmpty());
        
       cardBag.add(n1);
       cardBag.add(n1);
       cardBag.add(n1);
       cardBag.add(n1);
       cardBag.add(n1);
       
       cardBag.add(card1);
       
       cardBag.add(n2);
       cardBag.add(n2);
        
       System.out.println("Number of john smiths: " + cardBag.getFrequencyOf(n1));
        
       cardBag.remove(n1);
        
       System.out.println("After remove, Number of john smiths: " + cardBag.getFrequencyOf(n1));
        
       System.out.println("Bag's current size: " + cardBag.getCurrentSize()); 
       
       System.out.println("Is bag empty? " + cardBag.isEmpty());
       
       BaseballCard n3;
       n3 = cardBag.remove();
       
       System.out.println("Removed: " + n3);
       
       cardBag.clear();
       
       System.out.println("Bag's current size: " + cardBag.getCurrentSize()); 
       
       System.out.println("Is bag empty? " + cardBag.isEmpty()); 
       */
              
   }    
}