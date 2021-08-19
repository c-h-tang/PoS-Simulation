import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Bot {
    public static ArrayList<Food> list = new ArrayList<>();

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
        foodPanel.setBackground(Color.PINK);
        food.add(foodPanel);

        // shows the cuisines offered
        JPanel cuisines = new JPanel();
        cuisines.setPreferredSize(new Dimension(500, 120));
        cuisines.setBackground(Color.ORANGE);
        foodPanel.add(cuisines);

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
     /*   Strawberry s = new Strawberry(1);
        Apple a = new Apple(1);
        Banana b = new Banana(1);
        Orange o = new Orange(1);
        Grapes g = new Grapes(1);

        list.add(a);
        list.add(s);
        list.add(b);
        list.add(o);
        list.add(g);

        testObject();

      */
        beginPoS();
    }
}
