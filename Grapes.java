public class Grapes extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Grapes (int count) {
        super();
        this.count = count;
        this.name = "Grapes";
        this.calories = 4;
        this.price = .03;
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
