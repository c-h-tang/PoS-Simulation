public class PhillyCheesesteak extends Food{
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public PhillyCheesesteak(int count) {
        super();
        this.count = count;
        this.name = "Philly Cheesesteak";
        this.calories = 690;
        this.price = 8.50;
        this.type = "sandwich";
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
