public class GreekSalad extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public GreekSalad (int count) {
        super();
        this.count = count;
        this.name = "Greek Salad";
        this.calories = 280;
        this.price = 8.00;
        this.type = "salad";
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
