public abstract class Food {
    private String type;
    private double price;
    private int numberOf;
    private String name;
    private int calories;

    public Food() {
        this.name = "";
        this.price = 0.0;
        this.numberOf = 0;
        this.calories = 0;
        this.type = "";
    }

    abstract String getName();

    abstract double getPrice();

    abstract int getNumberOf();

    abstract int getCalories();

    abstract String getType();
}
