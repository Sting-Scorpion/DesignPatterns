package CreationalPatterns.BuilderPattern.example;

public class SubComboBuilderA extends ComboBuilder{
    @Override
    public ComboBuilder buildMain() {
        Food food = new Food();
        food.setName("Beef Burger");
        food.setType("Main");
        food.setPrice(16);
        combo.setMain(food);
        return this;
    }

    @Override
    public ComboBuilder buildDrink() {
        Food food = new Food();
        food.setName("Coke");
        food.setType("Drink");
        food.setPrice(4);
        combo.setDrink(food);
        return this;
    }

    @Override
    public ComboBuilder buildSnack() {
        Food food = new Food();
        food.setName("Chips");
        food.setType("Snack");
        food.setPrice(5);
        combo.setSnack(food);
        return this;
    }
}
