package cardgame;

/**
 * Card - a single playing card- Değişiklik denemesi (Emre)
 * @author
 * @version
 */
public class Card
{
    // constants - to do in lectures
    final String[] SUITS = { "Hearts", "Diamonds", "Spades", "Clubs"};
    final String[] FACES = { "A", "2", "3", "4", "5",
                             "6", "7", "8", "9", "10",
                             "J", "Q", "K"};
    
    final int NOOFCARDSINSUIT = 13;
    
    // properties - to do in lectures
    int  cardNo;
    
    // constructors  - to do in lectures
    public Card( int faceValue, int suit )
    {
        cardNo = faceValue + suit * NOOFCARDSINSUIT;
    }
    
    public Card( int cardNumber)
    {
        cardNo = cardNumber;
    }
    
    public int getFaceValue()
    {
        return cardNo % NOOFCARDSINSUIT;
    }
    
    public int getSuit()
    {
        return cardNo / NOOFCARDSINSUIT;
    }
    
    public String toString()
    {
        return FACES[ getFaceValue() ] + " of " + SUITS[ getSuit() ];
    }
    
    public boolean equals( Card c)
    {
        // ToDo
        if(c.getFaceValue()== getFaceValue())
            return true;
        return false;
    }
    
    public int compareTo( Card c)
    {
        int value1, value2;

        value1= c.getFaceValue();
        value2= getFaceValue();

        if(value1==0)
            value1=13;
        if(value2==0)
            value2=13;
        

        return value2- value1;
    }
}