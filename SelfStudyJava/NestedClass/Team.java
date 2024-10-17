package NestedClass;

public class Team {
    private String teamName;

    static class Player{
        private String playerName;
        private String position;

        public Player(String playerName, String position) {
            this.playerName = playerName;
            this.position = position;
        }

        public void displayPlayerInfo() {
            System.out.println("Player: " + playerName + ", Position: " + position);
        }
    }

    interface Coach {
        public void train();
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void displayTeamInfo(Player[] players, Coach coach) {
        System.out.println("Team: " + teamName);
        for (Player player : players) {
            player.displayPlayerInfo();
        }
        coach.train();
    }

    public static void main(String[] args) {
        Team team = new Team("Wild Cats");

        Team.Player player1 = new Team.Player("Alice", "Forward");
        Team.Player player2 = new Team.Player("Bob", "Goalkeeper");

        Team.Player[] players = {player1, player2};

        team.displayTeamInfo(players, new Team.Coach() {
            @Override
            public void train() {
                System.out.println("Coach is training the team.");
            }
        });
    }
}
