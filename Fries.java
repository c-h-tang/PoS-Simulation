public class Fries extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Fries (int count) {
        super();
        this.count = count;
        this.name = "Fries";
        this.calories = 365;
        this.price = 3.00;
        this.type = "fast food";
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
