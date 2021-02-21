package cardgame;
import java.util.ArrayList;

// Cardgame
// author:
// date:
public class CardGame
{
    // properties
    private Cards             fullPack;
    private ArrayList<Player> players;
    private ScoreCard         scoreCard;
    private Card[]           cardsOnTable;
    private int               roundNo;
    private int               turnOfPlayer;
    
    // constructors
    public CardGame( Player p1, Player p2, Player p3, Player p4)
    {
        
        roundNo = 1; // Holding the roundNo
        turnOfPlayer = 1; // Player 1 is the first guy which will play so it is 1

        System.out.println(turnOfPlayer);
        // scoreCard = new ScoreCard(); !!!!! 

        cardsOnTable = new Card[4]; // there is 4 card. So for that array will hold only for card
        
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
        cardsOnTable [turnOfPlayer - 1] = c;
        turnOfPlayer++;
        // After the playing of the 4th memeber I am checking whether turn ended or not
        if(turnOfPlayer > 4)
        {
            turnOfPlayer = 1;
            roundNo++;
            int bigest = cardsOnTable[0].getFaceValue();
            int index = 0;
            
            System.out.println("FACED VALUE OF THE "  + 0 + " IS " + cardsOnTable[0]. getFaceValue());

            for(int a = 1; a < cardsOnTable.length; a++)
            {
                System.out.println("FACED VALUE OF THE "  + a + " IS " + cardsOnTable[a]. getFaceValue());

                if(cardsOnTable[a].getFaceValue() > bigest)
                {
                    bigest = scoreCard.scores[a];
                    index = a;
                }
            }

            scoreCard.update(index, 1);
            
        }

        System.out.println(showScoreCard());
        return true;
    }
    
    public boolean isTurnOf(Player p)
    {
        
        for(int a = 0; a < players.size(); a++)
        {
            if( p == players.get(a) &&  a + 1 == turnOfPlayer)
            {
                return true;
            }
        }

        return false;
    }
    
    public boolean isGameOver()
    {

        System.out.println(fullPack.valid);
        if(fullPack.valid > 52)
        {
            return true;
        }
        return false;
    }
    
    public int getScore( int playerNumber)
    {
        System.out.println();
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
        return turnOfPlayer ; // returning the turnOfPlayer
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