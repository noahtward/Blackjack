public enum Suit {
    SPADES("♤"), 
    HEARTS("♡"), 
    DIAMONDS("♢"), 
    CLUBS("♧");

    private final String displayName;

    Suit(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
