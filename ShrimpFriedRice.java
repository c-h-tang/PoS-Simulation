public class ShrimpFriedRice extends Food{
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public ShrimpFriedRice(int count) {
        super();
        this.count = count;
        this.name = "Shrimp Fried Rice";
        this.calories = 600;
        this.price = 12.00;
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
