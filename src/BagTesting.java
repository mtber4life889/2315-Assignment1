import java.util.Scanner;

public class BagTesting {

   public static void main(String[] args) {
	   
	   Scanner reader = new Scanner(System.in);
	   String userInput = "";
	   
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
	   }
	   
	   BaseballCard card1 = new BaseballCard("curtis", "pitcher", "mariners", 60);
	   
	   
	   BagInterface<BaseballCard> cardBag = new ArrayBag<>();
	   
	   

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