import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class test {

    public static void beginPoS() {
        // instantiating the opening frame
        JFrame openingPage = new JFrame("Point of Sales Simulation");
        Container contents = openingPage.getContentPane();

       JPanel overall = new JPanel();
       overall.setLayout(new BoxLayout(overall, BoxLayout.X_AXIS));

       JPanel food = new JPanel();
       food.setBackground(Color.RED);
       food.setPreferredSize(new Dimension(500, 600));
       food.setLayout(new BoxLayout(food, BoxLayout.Y_AXIS));

       JPanel searchFood = new JPanel();
       searchFood.setPreferredSize(new Dimension(500, 100));
       searchFood.setBackground(Color.BLACK);
       food.add(searchFood);

       JPanel foodPanel = new JPanel();
       foodPanel.setPreferredSize(new Dimension(500, 500));
       foodPanel.setBackground(Color.PINK);
       food.add(foodPanel);

       JPanel cuisines = new JPanel();
       cuisines.setPreferredSize(new Dimension(500, 120));
       cuisines.setBackground(Color.ORANGE);
       foodPanel.add(cuisines);

       JPanel foodChoices = new JPanel();
       foodChoices.setPreferredSize(new Dimension(500, 380));
       foodChoices.setBackground(Color.GREEN);
       foodPanel.add(foodChoices);

       JPanel billTracker = new JPanel();
       billTracker.setLayout(new BoxLayout(billTracker, BoxLayout.Y_AXIS));
       billTracker.setBackground(Color.GREEN);
       billTracker.setPreferredSize(new Dimension(250, 600));

       JPanel billPanel = new JPanel();
       billPanel.setPreferredSize(new Dimension(250, 600));
       billPanel.setBackground(Color.GRAY);billPanel.setLayout(new BoxLayout(billPanel, BoxLayout.Y_AXIS));
       billTracker.add(billPanel);

       JPanel bill = new JPanel();
       bill.setBackground(Color.BLUE);
       bill.setPreferredSize(new Dimension(250, 450));
       billPanel.add(bill);

       JPanel billAddities = new JPanel();
       billAddities.setPreferredSize(new Dimension(250, 150));
       billAddities.setBackground(Color.CYAN);
       billPanel.add(billAddities);

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
        beginPoS();
    }
}
