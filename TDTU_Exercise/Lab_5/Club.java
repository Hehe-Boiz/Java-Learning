public class Club {
    private String name;
    private int wins;
    private int draws;
    private int losses;
    
    public Club() {
    }

    public Club(String name, int wins, int draws, int losses) {
        this.name = name;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }

    public Club(Club club){
        this.name = club.name;
        this.wins = club.wins;
        this.losses = club.losses;
        this.draws = club.draws;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int numMatchesPlayed(){
        return wins + draws + losses;
    }

    public boolean isFinish(){
        return (numMatchesPlayed() >= 10);
    }

    public int getPoints(){
        return wins*3 + draws*1 + losses*0;
    }

    @Override
    public String toString(){
        return name + " club: " + wins + "/" + draws + "/" +losses + " - "+getPoints();
    }
}
