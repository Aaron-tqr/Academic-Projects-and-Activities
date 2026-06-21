import javax.swing.JOptionPane;

public class MP_32 {
    public static void main(String[] args) {

        String input = " ";
        String meal = " ", drink = " ", dName = " ", mName = " ";
        int quantity = 0;
        double mealPrice = 0, drinkPrice = 0, totalAmount = 0;

        meal = JOptionPane.showInputDialog("Enter Meal (A/B/C/D): ");

        drink = JOptionPane.showInputDialog("Enter Drinks (S/M/L): ");

        input = JOptionPane.showInputDialog("Enter Quantity: ");
        quantity = Integer.parseInt(input);

        switch (meal) {
            case "A":
                mName = "Chicken & Spaghetti";
                mealPrice = 150;
                break;
            case "B":
                mName = "Hamburger & Fries";
                mealPrice = 145;
                break;
            case "C":
                mName = "Cheesedog";
                mealPrice = 100;
                break;
            case "D":
                mName = "Pizza";
                mealPrice = 80;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Meal Selection");
                return;
        }

        switch (drink) {
            case "S":
                dName = "Small Drink(s)";
                drinkPrice = 30;
                break;
            case "M":
                dName = "Medium Drink(s)";
                drinkPrice = 35;
                break;
            case "L":
                dName = "Large Drink(s)";
                drinkPrice = 40;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Drink Selection");
                return;
        }

        totalAmount = (mealPrice + drinkPrice) * quantity;


        String msg = ("Meal: " + meal + "\nDrinks: " + drink + "\nQuantity: " + quantity + 
                      "\nOrder: " + mName + " and " + dName + "\nAmount: " + totalAmount);

        JOptionPane.showMessageDialog(null, msg);
    }
}

