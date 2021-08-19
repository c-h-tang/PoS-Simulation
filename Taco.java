public class Taco extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Taco (int count) {
        super();
        this.count = count;
        this.name = "Taco";
        this.calories = 150;
        this.price = 1.50;
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
