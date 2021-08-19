public class TunaSaladSandwich extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public TunaSaladSandwich(int count) {
        super();
        this.count = count;
        this.name = "Tuna Salad Sandwich";
        this.calories = 500;
        this.price = 5.50;
        this.type = "sandwich";
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOf() { return count; }

    public int getCalories() {
        return calories;
    }

    public String getType() { return type; }
}
