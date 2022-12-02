public class Sport {
    int players;
    String name;
    String coach;
    boolean isGood;

    public void print() {
        System.out.println("on team " + name + " there are " + players + " players");
        System.out.println("their coach's name is " + coach + " and it is " + isGood + " that they are good");
        Rating();
    }

    public Sport(int pPlayers, String pName, String pCoach, boolean pIsGood) {
        players = pPlayers;
        name = pName;
        coach = pCoach;
        isGood = pIsGood;
    }

    public void Rating() {
        if(isGood == true) {
            System.out.println("This is a good season!");
        }
        else {
            System.out.println("This is a bad season.");
        }
    }
}
