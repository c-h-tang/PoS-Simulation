import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Bot {
    public static ArrayList<Food> list = new ArrayList<>();
    public static ArrayList<Food> cart = new ArrayList<>();

    public static void fillList() {
        // fruits
        Strawberry s = new Strawberry(1);
        Apple a = new Apple(1);
        Banana b = new Banana(1);
        Orange o = new Orange(1);
        Grapes g = new Grapes(1);
        list.add(a);
        list.add(s);
        list.add(b);
        list.add(o);
        list.add(g);

        // fast food
        Hamburger h = new Hamburger(1);
        ChickenTender ct = new ChickenTender(1);
        Fries f = new Fries(1);
        Taco t = new Taco(1);
        CheeseCurds cc = new CheeseCurds(1);
        list.add(h);
        list.add(ct);
        list.add(f);
        list.add(t);
        list.add(cc);

        // salads
        CaesarSalad cs = new CaesarSalad(1);
        GreekSalad gs = new GreekSalad(1);
        ChoppedSalad chs = new ChoppedSalad(1);
        CobbSalad cbs = new CobbSalad(1);
        MediterraneanSalad ms = new MediterraneanSalad(1);
        list.add(cs);
        list.add(gs);
        list.add(chs);
        list.add(cbs);
        list.add(ms);

        // noodles
        Ramen r = new Ramen(1);


        ShrimpFriedRice sfr = new ShrimpFriedRice(1);


        PhillyCheesesteak pc = new PhillyCheesesteak(1);


        list.add(r);
        list.add(sfr);
        list.add(pc);
    }

    public static void testObject() {
        for (Food f : list) {
            System.out.println("Name: " + f.getName());
            System.out.println("Quantity: " + f.getNumberOf());
            System.out.println("Price: " + f.getPrice());
            System.out.println("Total Price: " + f.getNumberOf() * f.getPrice());
            System.out.println("Calories: " + f.getCalories());
            System.out.println("Type: " + f.getType());
            System.out.println();
        }
    }

    public static void makeCuisineButtons(JPanel cuisinePanel) {
        ArrayList<String> uniqueCuisines = new ArrayList<>();

        for (Food f : list) {
            String thisCuisine = f.getType().toLowerCase();
            if (!uniqueCuisines.contains(thisCuisine)) {
                uniqueCuisines.add(thisCuisine);
            }
        }
        for (String cuisine : uniqueCuisines) {
            String uppercaseCuisine = cuisine.substring(0, 1).toUpperCase() + cuisine.substring(1);
            JButton b = new JButton(uppercaseCuisine);
            b.setPreferredSize(new Dimension(130, 28));
            System.out.println("Created a button");
            cuisinePanel.add(b);
        }
    }

    public static void beginPoS() {
        // instantiating the opening frame
        JFrame openingPage = new JFrame("Point of Sales Simulation");
        Container contents = openingPage.getContentPane();

        // panel holding everything in the frame
        JPanel overall = new JPanel();
        overall.setLayout(new BoxLayout(overall, BoxLayout.X_AXIS));

        // LHS
        JPanel food = new JPanel();
        food.setBackground(Color.RED);
        food.setPreferredSize(new Dimension(500, 600));
        food.setLayout(new BoxLayout(food, BoxLayout.Y_AXIS));

        // allow user to search for a specific food
        JPanel searchFood = new JPanel();
        searchFood.setPreferredSize(new Dimension(500, 100));
        searchFood.setBackground(Color.BLACK);
        food.add(searchFood);

        // Middle LHS of panel
        JPanel foodPanel = new JPanel();
        foodPanel.setPreferredSize(new Dimension(500, 500));
        foodPanel.setBackground(Color.WHITE);
        food.add(foodPanel);

        // shows the cuisines offered
        JPanel cuisines = new JPanel();
        cuisines.setPreferredSize(new Dimension(500, 120));
        cuisines.setBackground(Color.WHITE);
        foodPanel.add(cuisines);

        JPanel cuisineText = new JPanel();
        cuisineText.setPreferredSize(new Dimension(500, 30));
        cuisineText.setBackground(Color.WHITE);

        JLabel cuisineNote = new JLabel();
        cuisineNote.setFont(new Font("Serif", Font.BOLD, 20));
        cuisineNote.setText("Select a cuisine to narrow your search");
        cuisineText.add(cuisineNote);

        JPanel cuisineSelection = new JPanel();
        cuisineSelection.setPreferredSize(new Dimension(500, 90));
        cuisineSelection.setBackground(Color.WHITE);

        makeCuisineButtons(cuisineSelection);
        cuisines.add(cuisineText);
        cuisines.add(cuisineSelection);

        // shows the food choices for a particular cuisine
        JPanel foodChoices = new JPanel();
        foodChoices.setPreferredSize(new Dimension(500, 380));
        foodChoices.setBackground(Color.GREEN);
        foodPanel.add(foodChoices);

        // RHS of window
        JPanel billTracker = new JPanel();
        billTracker.setLayout(new BoxLayout(billTracker, BoxLayout.Y_AXIS));
        billTracker.setBackground(Color.GREEN);
        billTracker.setPreferredSize(new Dimension(250, 600));

        // transition panel necessary for RHS
        JPanel billPanel = new JPanel();
        billPanel.setPreferredSize(new Dimension(250, 600));
        billPanel.setBackground(Color.GRAY);
        billPanel.setLayout(new BoxLayout(billPanel, BoxLayout.Y_AXIS));
        billTracker.add(billPanel);

        // shows the bill for all items bought
        JPanel bill = new JPanel();
        bill.setBackground(Color.BLUE);
        bill.setPreferredSize(new Dimension(250, 450));
        billPanel.add(bill);

        // shows the total, tax, tip, etc
        JPanel billAddities = new JPanel();
        billAddities.setPreferredSize(new Dimension(250, 150));
        billAddities.setBackground(Color.CYAN);
        billPanel.add(billAddities);

        // adds all panels to the frame
        overall.add(food);
        overall.add(billTracker);
        openingPage.add(overall);

        openingPage.pack();
        openingPage.setVisible(true);
        openingPage.setLocationRelativeTo(null);
        openingPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        openingPage.setResizable(false);
    }

    public static void main(String[] args) {
        fillList();
        // testObject();

        beginPoS();
    }
}
