/* Programmer: Curtis Chippeway
 * The purpose of this class is to be used for creating Baseball Card Objects from
 * The only source used was class notes from Kenward Chin describing the equals method
 */
public class BaseballCard {
	private String name;
	private String position;
	private String team;
	private double price;
	
	//default constructor
	public BaseballCard()
	{
		setPlayerName("");
		setPlayerPosition("");
		setPlayerTeam("");
		setCardPrice(0);
	}
	
	//main constructor
	public BaseballCard(String playerName, String playerPosition, String playerTeam, double cardPrice)
	{
		setPlayerName(playerName);
		setPlayerPosition(playerPosition);
		setPlayerTeam(playerTeam);
		setCardPrice(cardPrice);
	}

	//get player name for card object
	public String getPlayerName() 
	{
		return name;
	}

	//set player name for card object
	public void setPlayerName(String playerName)
	{
		name = playerName;
	}

	//get player position for card object
	public String getPlayerPosition()
	{
		return position;
	}

	//set player position for card object
	public void setPlayerPosition(String playerPosition)
	{
		position = playerPosition;
	}

	//get player team for card object
	public String getPlayerTeam()
	{
		return team;
	}

	//set player team for card object
	public void setPlayerTeam(String playerTeam)
	{
		team = playerTeam;
	}

	//get price for card object
	public double getCardPrice() 
	{
		return price;
	}

	//set price for card object
	public void setCardPrice(double cardPrice) 
	{
		price = cardPrice;
	}
	
	//compare two card object to see if they're equal
	public boolean equals(Object obj)
	{
		if (obj != null && obj instanceof BaseballCard)
		{
			BaseballCard aCard = (BaseballCard) obj;
			
			return (this.name.equals(aCard.name) && (this.name.equals(aCard.name)));
		}
		else
			return false;
	}
	
	//sends useful information about a card object to a formatted string output.
	public String toString()
	{
		return "\n" + "Baseball Card Information: " + "\n" + "Card Price: " + price + "\n" + "Player Name: " + name + "\n" + "Player Position: " + position + "\n" + "Player Team: " + team + "\n";
	}
	

}
