import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil infoCafeUtil = new CafeUtil();

        System.out.printf(" \nStreak Goal = %s \n", infoCafeUtil.getStreakGoal());
                
        double[] totalItems = {1, 2, 3, 4, 5};
        System.out.printf("Double Items Total = %s \n", infoCafeUtil.getOrderTotal(totalItems));

        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("drip coffee");
        menuItems.add("cappucino");
        menuItems.add("latte");
        menuItems.add("mocha");
        infoCafeUtil.displayMenu(menuItems);

        ArrayList<String> customers = new ArrayList<String>();
        for(int i = 0; i < 5; i++) {
            infoCafeUtil.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
