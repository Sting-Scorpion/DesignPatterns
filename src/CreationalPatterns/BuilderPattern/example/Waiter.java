package CreationalPatterns.BuilderPattern.example;

public class Waiter {
    private ComboBuilder cb;

    public void setComboBuilder(ComboBuilder cb){
        this.cb = cb;
    }

    public Combo construct(){
        // 链式编程
        cb.buildDrink()
                .buildMain()
                .buildSnack();
        return cb.getCombo();
    }
}
