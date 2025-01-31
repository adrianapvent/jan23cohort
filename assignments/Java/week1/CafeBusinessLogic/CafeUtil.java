import java.util.ArrayList;
public class CafeUtil {
    public static int getStreakGoal() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public static double getOrderTotal(double[] prices) {
        double sum = 0;
        for (double price :prices) {
            sum += price;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        System.out.println(menuItems);

    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName + "!");
        System.out.println("There are" + " " + customers.size() + " " + "people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}
