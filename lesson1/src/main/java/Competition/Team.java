package Competition;

public class Team implements Competitor {

    String nameTeam;
    String name;
    boolean isSuccess;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    Team[] newTeam = new Team[4];

    public Team(String nameTeam, Players player1, Players player2, Players player3, Players player4){
        this.nameTeam = nameTeam;
        newTeam = new Team[]{player1, player2, player3, player4};
    }

    public Team() {

    }
    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " хорошо справился с кроссом");
        } else {
            System.out.println(name + " не справился с кроссом");
            isSuccess = false;
        }

    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(name + " отлично проплыл");
        } else {
            System.out.println(name + " не смог проплыть");
            isSuccess = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену");
            isSuccess = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return isSuccess;
    }

    public void info(Team [] team) {
        for (Team player: team) {
            if (player.isSuccess)
                System.out.println(player.name + " удачно справился с трассой");
            else
                System.out.println(player.name + " не дошел до финиша");
        }
    }
}
