package Competition;

public class Track extends Obstacles {
    int distance;
    public  Track(int distance){
        this.distance = distance;
    }
    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
    }
}
