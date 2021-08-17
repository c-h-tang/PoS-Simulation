public class Apple extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Apple(int count) {
        super();
        this.count = count;
        this.name = "Apple";
        this.calories = 95;
        this.price = .25;
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
