package CreationalPatterns.BuilderPattern.example;

public class Customer {
    public static void main(String[] args) {
        ComboBuilder cb1 = new SubComboBuilderA();
        ComboBuilder cb2 = new SubComboBuilderB();

        Waiter waiter = new Waiter();

        waiter.setComboBuilder(cb1);
        Combo combo = waiter.construct();

        System.out.println("-- The combo 1 has:");
        System.out.println(combo.getMain().getType() + " -- " + combo.getMain().getName() + " --- " + combo.getMain().getPrice());
        System.out.println(combo.getDrink().getType() + " -- " + combo.getDrink().getName() + " --- " + combo.getDrink().getPrice());
        System.out.println(combo.getSnack().getType() + " -- " + combo.getSnack().getName() + " --- " + combo.getSnack().getPrice());

        waiter.setComboBuilder(cb2);
        combo = waiter.construct();

        System.out.println("-- The combo 2 has:");
        System.out.println(combo.getMain().getType() + " -- " + combo.getMain().getName() + " --- " + combo.getMain().getPrice());
        System.out.println(combo.getDrink().getType() + " -- " + combo.getDrink().getName() + " --- " + combo.getDrink().getPrice());
        System.out.println(combo.getSnack().getType() + " -- " + combo.getSnack().getName() + " --- " + combo.getSnack().getPrice());
    }
}
