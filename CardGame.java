package cardgame;

import java.util.ArrayList;

// Cardgame
// author:
// date:
public class CardGame
{
    // properties
    Cards             fullPack;
    ArrayList<Player> players;
    ScoreCard         scoreCard;
    Cards[]           cardsOnTable;
    int               roundNo;
    int               turnOfPlayer;
    
    // constructors
    public CardGame( Player p1, Player p2, Player p3, Player p4)
    {
        int roundNo = 1; // Holding the roundNo
        int turnOfPlayer = 1; // Player 1 is the first guy which will play so it is 1

        // scoreCard = new ScoreCard(); !!!!! 

        cardsOnTable = new Cards[4]; // there is 4 card. So for that array will hold only for card
        // in each turn we will empty this array;
        
        fullPack = new Cards(true); 

        players = new ArrayList<Player>();

        // adding all the players
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);

        scoreCard = new ScoreCard(4); // Creating the score card for holding the scores
    }
    
    // methods
    public boolean playTurn( Player p, Card c)
    {
        // Todo
        return false;
    }
    
    public boolean isTurnOf(Player p)
    {
        if((roundNo % 4 ) + 1 == p. )
        {
            
        }
        return false;
    }
    
    public boolean isGameOver()
    {
        if(fullPack.valid >= 0)
        {
            return true;
        }
        return false;
    }
    
    public int getScore( int playerNumber)
    {
        return scoreCard.getScore(playerNumber);
    }
    
    public String getName( int playerNumber)
    {
        // Returning the name of the player
        return players.get(playerNumber).getName();
    }
    
    public int getRoundNo()
    {
        return roundNo;
    }
    
    public int getTurnOfPlayerNo()
    {
        // ToDo
        return -1;
    }
    
    public Player[] getWinners()
    {
        Player [] winners = new Player[scoreCard.getWinners().length];
        

        scoreCard.getWinners();
    }
    
    public String showScoreCard()
    {
        return scoreCard.toString();
    }
    
}