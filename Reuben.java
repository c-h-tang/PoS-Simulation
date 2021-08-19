public class Reuben extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Reuben(int count) {
        super();
        this.count = count;
        this.name = "Reuben";
        this.calories = 620;
        this.price = 6.99;
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
