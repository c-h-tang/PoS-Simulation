import javax.crypto.Mac;
import javax.swing.*;
import java.awt.*;
import java.net.URI;
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
        LoMein lm = new LoMein(1);
        Laksa l = new Laksa(1);
        PadThai pt = new PadThai(1);
        MacnCheese mnc = new MacnCheese(1);
        list.add(r);
        list.add(lm);
        list.add(l);
        list.add(pt);
        list.add(mnc);

        // rice dishes
        ShrimpFriedRice sfr = new ShrimpFriedRice(1);
        ChickenFriedRice cfr = new ChickenFriedRice(1);
        VegetableFriedRice vfr = new VegetableFriedRice(1);
        Paella p = new Paella(1);
        NasiGoreng ng = new NasiGoreng(1);
        list.add(sfr);
        list.add(cfr);
        list.add(vfr);
        list.add(p);
        list.add(ng);

        // sandwiches
        PhillyCheesesteak pc = new PhillyCheesesteak(1);
        ShrimpPoBoy spb = new ShrimpPoBoy(1);
        BanhMi bm = new BanhMi(1);
        Reuben reu = new Reuben(1);
        TunaSaladSandwich tss = new TunaSaladSandwich(1);
        list.add(pc);
        list.add(spb);
        list.add(bm);
        list.add(reu);
        list.add(tss);
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

    public static void addSearchFeature(JPanel searchPanel) {
        searchPanel.setLayout(new BoxLayout(searchPanel, BoxLayout.Y_AXIS));

        JPanel blankPanel = new JPanel();
        blankPanel.setPreferredSize(new Dimension(500, 30));
        blankPanel.setBackground(Color.WHITE);
        searchPanel.add(blankPanel);

        JPanel sp = new JPanel();
        sp.setBackground(Color.white);
        sp.setPreferredSize(new Dimension(500, 70));
        JButton searchButton = new JButton("Search");
        JTextField searchInput = new JTextField("", 20);

        sp.add(searchInput);
        sp.add(searchButton);
        searchPanel.add(sp);
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

            b.addActionListener(e2 -> {
                for(Food ff : list) {
                    if (ff.getType().equals(b.getText().toLowerCase())) {
                        System.out.println(ff.getName());
                    }
                }
            });
            cuisinePanel.add(b);
        }
    }

    public static void showCuisineSelection(JPanel cuisineSelection, boolean buttonSelected) {

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
        food.setPreferredSize(new Dimension(500, 600));
        food.setLayout(new BoxLayout(food, BoxLayout.Y_AXIS));
        food.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

        // allow user to search for a specific food
        JPanel searchFood = new JPanel();
        searchFood.setPreferredSize(new Dimension(500, 100));
        searchFood.setBackground(Color.WHITE);
        food.add(searchFood);

        addSearchFeature(searchFood);

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

        showCuisineSelection(cuisineSelection, true);

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
