package BehavioralPatterns.StatePattern.example;

public class PrimaryState extends AbstractState{
    public PrimaryState(AbstractState state){
        acc = state.acc;
        point = state.getPoint();
        this.state = "Noob";
    }

    public PrimaryState(ForumAccount acc){
        this.acc = acc;
        point = 0;
        this.state = "Noob";
    }

    @Override
    public void downloadFile(int score) {
        System.out.println("-- [" + acc.getName() + " has no access to download files] --");
    }

    @Override
    public void checkState(int score) {
        if(point >= 100){
            acc.setState(new HighState(this));
            System.out.println("-- [Level UP] --");
        }
    }
}
