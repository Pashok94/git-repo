package Competition;

public class Wall extends Obstacles {
    int height;
    public  Wall(int height){
        this.height = height;
    }
    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
