public class Paella extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Paella (int count) {
        super();
        this.count = count;
        this.name = "Paella";
        this.calories = 750;
        this.price = 14.00;
        this.type = "rice";
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
