public class Strawberry extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Strawberry (int count) {
        super();
        this.count = count;
        this.name = "Strawberry";
        this.calories = 5;
        this.price = .10;
        this.type = "fruit";
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
