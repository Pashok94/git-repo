package Competition;

public class CompetititorTestDrive {
    public static void main(String[] args) {

        Team newTeam1 = new Team("Winner",
                new Players("Вася", 1000, 3, 2500),
                new Players("Данил", 1500, 5, 1000),
                new Players("Миша", 2000, 3, 1500),
                new Players("Ваня", 1700, 4,2000));

        Obstacles obstacles = new Obstacles(new Track(1500), new Wall(4),
                new Water(1500));

        Obstacles.startCompetition(newTeam1.newTeam, obstacles.obstacles);

        newTeam1.info(newTeam1.newTeam);
    }
}
