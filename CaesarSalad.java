public class CaesarSalad extends Food{
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public CaesarSalad (int count) {
        super();
        this.count = count;
        this.name = "Caesar Salad";
        this.calories = 330;
        this.price = 8.00;
        this.type = "salad";
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
