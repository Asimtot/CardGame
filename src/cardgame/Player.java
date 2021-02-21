package cardgame;

// Player - Simple card game player with name and hand of cards
// author:
// date:
public class Player
{
    // properties
    String name;
    Cards hand;
    
    // constructors
    public Player( String name)
    {
        this.name = name;
        hand = new Cards(true);
    }
    
    // methods
    public String getName()
    {
        return name;
    }
    
    public void add( Card c)
    {
        hand.addTopCard(c);
    }
    
    // Playing the topCard of his pile
    public Card playCard()
    {
        return hand.getTopCard() ;
    }
    
} // end class Player
