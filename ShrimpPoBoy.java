public class ShrimpPoBoy extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public ShrimpPoBoy(int count) {
        super();
        this.count = count;
        this.name = "Shrimp Po Boy";
        this.calories = 500;
        this.price = 6.00;
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
