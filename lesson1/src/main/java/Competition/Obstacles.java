package Competition;

public class Obstacles {
    Obstacles[] obstacles = new Obstacles[3];
    public Obstacles(){}
    public Obstacles(Track track, Wall wall, Water water){
        obstacles = new Obstacles[]{track, wall, water};
    }

    public static void startCompetition(Team[] team, Obstacles[] obstacles){
        for (Team player: team) {
            for (Obstacles obstacle: obstacles) {
                obstacle.doIt(player);
                if (!player.isSuccess)
                    break;
            }
        }
    }
    public void doIt(Competitor competitor){
    }
}
