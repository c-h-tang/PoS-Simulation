public class Banana extends Food{

    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public Banana(int count) {
        super();
        this.count = count;
        this.name = "Banana";
        this.calories = 105;
        this.price = .15;
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
