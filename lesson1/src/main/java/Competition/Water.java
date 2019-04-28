package Competition;

public class Water extends Obstacles {
    int distance;
    public Water(int distance){
        this.distance = distance;
    }
    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(distance);
    }
}
