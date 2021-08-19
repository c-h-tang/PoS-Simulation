public class VegetableFriedRice extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public VegetableFriedRice(int count) {
        super();
        this.count = count;
        this.name = "Vegetable Fried Rice";
        this.calories = 530;
        this.price = 10.00;
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
