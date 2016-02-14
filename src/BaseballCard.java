
public class BaseballCard {
	private String name;
	private String position;
	private String team;
	private double price;
	
	public BaseballCard()
	{
		setPlayerName("");
		setPlayerPosition("");
		setPlayerTeam("");
		setCardPrice(0);
	}
	
	public BaseballCard(String playerName, String playerPosition, String playerTeam, double cardPrice)
	{
		setPlayerName(playerName);
		setPlayerPosition(playerPosition);
		setPlayerTeam(playerTeam);
		setCardPrice(cardPrice);
	}

	public String getPlayerName() 
	{
		return name;
	}

	public void setPlayerName(String playerName)
	{
		name = playerName;
	}

	public String getPlayerPosition()
	{
		return position;
	}

	public void setPlayerPosition(String playerPosition)
	{
		position = playerPosition;
	}

	public String gePlayerTeam()
	{
		return team;
	}

	public void setPlayerTeam(String playerTeam)
	{
		team = playerTeam;
	}

	public double getCardPrice() 
	{
		return price;
	}

	public void setCardPrice(double cardPrice) 
	{
		price = cardPrice;
	}
	
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
	
	public String toString()
	{
		return "\n" + "Baseball Card Information: " + "\n" + "Card Price: " + price + "\n" + "Player Name: " + name + "\n" + "Player Position: " + position + "\n" + "Player Team: " + team + "\n";
	}
	

}
