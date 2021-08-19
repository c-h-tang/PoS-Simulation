public class Laksa extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Laksa(int count) {
        super();
        this.count = count;
        this.name = "Laksa";
        this.calories = 700;
        this.price = 12.00;
        this.type = "noodles";
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
