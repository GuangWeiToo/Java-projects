import java.util.*;
public class Card{
    private final Rank rank;
    private final Suit suit;

    private final static Map<String, Card>CARD_CACHE= initCache();
    private static Map<String,Card>initCache() {
        final Map<String,Card>cache= new HashMap<>();
        for(final Suit suit:Suit.values()){
            for(final Rank rank: Rank.values()){
                cache.put("",new Card(rank,suit));
            }
        }
        return Collections.unmodifiableMap(cache);
    }
    private Card(final Rank rank,final Suit suit){
        this.rank=rank;
        this.suit=suit;
    }
    enum Suit{
        Diamonds,
        Clubs,
        Hearts,
        Spades
    }
    enum Rank{
        Two(2),
        Three(3),
        Four(4),
        Five(5),
        Six(6),
        Seven(7),
        Eight(8),
        Nine(9),
        Ten(10),
        Jack(11),
        Queen(12),
        King(13),
        Ace(14);
           
        private final int rankValue;
        Rank(final int rankValue){
                this.rankValue=rankValue;
        }
    };
    

}
//https://www.youtube.com/watch?v=5QyU35ct6M0