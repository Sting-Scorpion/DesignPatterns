package StructuralPatterns.CompositePattern.example;

public class Client {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("management Menu", 2);
        menu1.add(new MenuItem("access pages", 3))
                .add(new MenuItem("add menu", 3))
                .add(new MenuItem("delete menu", 3))
                .add(new MenuItem("edit menu", 3));

        MenuComponent menu2 = new Menu("management Mod", 2);
        menu2.add(new MenuItem("access pages", 3))
                .add(new MenuItem("commit access", 3));

        MenuComponent menu3 = new Menu("management User", 2);
        menu3.add(new MenuItem("access pages", 3))
                .add(new MenuItem("add user", 3))
                .add(new MenuItem("edit user", 3));

        MenuComponent root = new Menu("management system", 1);
        root.add(menu1)
                .add(menu2)
                .add(menu3);

        root.print();
    }
}
