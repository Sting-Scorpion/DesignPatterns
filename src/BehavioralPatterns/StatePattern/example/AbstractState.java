package BehavioralPatterns.StatePattern.example;

public abstract class AbstractState {
    protected ForumAccount acc;
    protected int point;
    protected String state;

    public abstract void checkState(int score);

    public void downloadFile(int score){
        System.out.println("-- [" + acc.getName() + " downloaded file] --");
        System.out.println("## [Deduct " + score + " points] ##");
        point -= score;
        checkState(score);
        System.out.println("** Remaining points: " + point + ", level: " + acc.getState().getState() + " **");
    }

    public void writeNote(int score){
        System.out.println("-- [" + acc.getName() + " published a note] --");
        System.out.println("## [Gain " + score + " points] ##");
        point += score;
        checkState(score);
        System.out.println("** Remaining points: " + point + ", level: " + acc.getState().getState() + " **");
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
