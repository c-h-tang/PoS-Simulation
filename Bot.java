import java.util.ArrayList;

public class Bot {
    public static ArrayList<Food> list = new ArrayList<>();

    public static void testObject() {
        for (Food f : list) {
            System.out.println("Name: " + f.getName());
            System.out.println("Quantity: " + f.getNumberOf());
            System.out.println("Price: " + f.getPrice());
            System.out.println("Total Price: " + f.getNumberOf() * f.getPrice());
            System.out.println("Calories: " + f.getCalories());
            System.out.println("Type: " + f.getType());
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Strawberry s = new Strawberry(1);
        Apple a = new Apple(1);
        Banana b = new Banana(1);
        Orange o = new Orange(1);
        Grapes g = new Grapes(1);

        list.add(a);
        list.add(s);
        list.add(b);
        list.add(o);
        list.add(g);

        testObject();
    }
}
