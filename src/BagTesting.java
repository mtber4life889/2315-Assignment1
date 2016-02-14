
public class BagTesting {

   public static void main(String[] args) {
	   
	   BaseballCard card1 = new BaseballCard("curtis", "pitcher", "mariners", 60);
	   
	   
	   BagInterface<BaseballCard> cardBag = new ArrayBag<>();

	   BaseballCard n1 = new BaseballCard();
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
       
              
   }
    
}