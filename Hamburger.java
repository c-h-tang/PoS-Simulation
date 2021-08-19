public class Hamburger extends Food{
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Hamburger(int count) {
        super();
        this.count = count;
        this.name = "Hamburger";
        this.calories = 400;
        this.price = 4.50;
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
