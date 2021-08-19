public class CheeseCurds extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public CheeseCurds (int count) {
        super();
        this.count = count;
        this.name = "Cheese Curds";
        this.calories = 270;
        this.price = 4.00;
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
