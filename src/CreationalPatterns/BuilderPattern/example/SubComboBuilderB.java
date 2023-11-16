package CreationalPatterns.BuilderPattern.example;

public class SubComboBuilderB extends ComboBuilder{
    @Override
    public ComboBuilder buildMain() {
        Food food = new Food();
        food.setName("Chicken Wrap");
        food.setType("Main");
        food.setPrice(13);
        combo.setMain(food);
        return this;
    }

    @Override
    public ComboBuilder buildDrink() {
        Food food = new Food();
        food.setName("Juice");
        food.setType("Drink");
        food.setPrice(5);
        combo.setDrink(food);
        return this;
    }

    @Override
    public ComboBuilder buildSnack() {
        Food food = new Food();
        food.setName("Onion Ring");
        food.setType("Snack");
        food.setPrice(6);
        combo.setSnack(food);
        return this;
    }
}
