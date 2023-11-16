package CreationalPatterns.BuilderPattern.example;

public class Combo {
    // 套餐包含主食、饮料和小食
    private Food main;
    private Food drink;
    private Food snack;

    public Food getMain() {
        return main;
    }

    public void setMain(Food main) {
        this.main = main;
    }

    public Food getDrink() {
        return drink;
    }

    public void setDrink(Food drink) {
        this.drink = drink;
    }

    public Food getSnack() {
        return snack;
    }

    public void setSnack(Food snack) {
        this.snack = snack;
    }
}
