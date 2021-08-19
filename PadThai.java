public class PadThai extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public PadThai(int count) {
        super();
        this.count = count;
        this.name = "Pad Thai";
        this.calories = 600;
        this.price = 9.99;
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
