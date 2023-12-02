package BehavioralPatterns.StatePattern.example;

public class HighState extends AbstractState{
    public HighState(AbstractState state) {
        acc = state.acc;
        point = state.getPoint();
        this.state = "Expert";
    }

    @Override
    public void writeNote(int score) {
        System.out.println("-- [" + acc.getName() + " published a note] --");
        System.out.println("## [Gain " + score + " * 2 points (Double Points!)] ##");
        point += score * 2;
        checkState(score);
        System.out.println("** Remaining points: " + point + ", level: " + state + " **");
    }

    @Override
    public void checkState(int score) {
        if(point < 0){
            System.out.println("-- [Remaining points not enough for downloading] --");
            point += score;
            System.out.println("## [Undo deduction] ##");
        }
        else if(point < 100){
            acc.setState(new PrimaryState(this));
            System.out.println("-- [Level DOWN] --");
        }
    }
}
