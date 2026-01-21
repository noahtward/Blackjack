public enum Rank {

        //values of each of the cards up to aces, however, ace is only 11 right now
        TWO("2", 2), THREE("3", 3), FOUR("4", 4),
        FIVE("5", 5), SIX("6", 6), SEVEN("7", 7),
        EIGHT("8", 8), NINE("9", 9), TEN("10", 10),
        JACK("J", 10), QUEEN("Q", 10), KING("K", 10),
        ACE("A", 11);

        private final String displayName;
        private final int value;
        
        Rank(String displayName, int value) {
            this.displayName = displayName;
            this.value = value;
        } 

        public String getDisplayName() {//returns name of the rank
            return displayName;
        }

        public int getValue() { //returns value of rank
            return value;
        }
    }