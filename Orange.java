public class Orange extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Orange(int count) {
        super();
        this.count = count;
        this.name = "Orange";
        this.calories = 45;
        this.price = .70;
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
