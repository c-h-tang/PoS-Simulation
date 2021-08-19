public class CobbSalad extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public CobbSalad (int count) {
        super();
        this.count = count;
        this.name = "Cobb Salad";
        this.calories = 350;
        this.price = 8.50;
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
