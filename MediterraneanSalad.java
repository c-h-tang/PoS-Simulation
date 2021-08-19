public class MediterraneanSalad extends Food{
    private String name;
    private int calories;
    private double price;
    private int count;
    private String type;

    public MediterraneanSalad (int count) {
        super();
        this.count = count;
        this.name = "Mediterranean Salad";
        this.calories = 300;
        this.price = 9.00;
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
