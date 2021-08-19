public class LoMein extends Food {
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public LoMein(int count) {
        super();
        this.count = count;
        this.name = "Lo Mein";
        this.calories = 530;
        this.price = 6.99;
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
