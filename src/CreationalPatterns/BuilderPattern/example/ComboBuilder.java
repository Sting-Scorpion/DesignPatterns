package CreationalPatterns.BuilderPattern.example;

public abstract class ComboBuilder {
    protected Combo combo = new Combo();

    public abstract ComboBuilder buildMain();

    public abstract ComboBuilder buildDrink();

    public abstract ComboBuilder buildSnack();

    public Combo getCombo(){
        return combo;
    }
}
