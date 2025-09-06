package gameLogic;

public record Card(Rank rank, Suit suit) {
    @Override
    public String toString(){
        String cardValue = switch(rank){
            case JACK -> "J";
            case QUEEN -> "Q";
            case KING -> "K";
            case ACE -> "A";
            default -> String.valueOf(rank.value());
        };

        String cardSuit = switch(suit){
            case CLUBS -> "C";
            case DIAMONDS -> "D";
            case HEARTS -> "H";
            case SPADES -> "S";
        };

        return (cardValue + cardSuit);
    }
}
