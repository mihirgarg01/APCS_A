package Unit7;

public class CookierOrderDriver {
    public static void main(String[] args) {
        boolean test1 = false;
        boolean test2 = false;
        System.out.println("******Testing TotalBoxesOrdered*****");
        MasterOrder order = new MasterOrder();
        if (order.getTotalBoxes() == 0) {
            System.out.println("order is empty!");
            test1 = true;
        } else
            System.out.println(
                    "Oops! Looks like your code doesn't properly check to see if the master order is empty.\n");
        order.addOrder(new CookieOrder("Raisin", 3));
        order.addOrder(new CookieOrder("Oatmeal", 8));

        System.out.println("Total boxes ordered " + order.getTotalBoxes());
        if (order.getTotalBoxes() == 11)
            test2 = true;
        else
            System.out.println(
                    "Oops! Looks like your code doesn't properly count the number of boxes in the master order.\n");
        if (test1 && test2)
            System.out.println("Looks like your code works well!");
        else
            System.out.println("Make some changes to your code, please.");
        order.addOrder(new CookieOrder("Sugar", 2));
        System.out.println("*****Testing removeVariety*****");
        int raisinRem = order.removeVariety("Raisin");
        System.out.println("Removed " + raisinRem + " boxes of Raisin cookies");
        int sugarRem = order.removeVariety("Sugar");
        System.out.println("Removed " + sugarRem + " boxes of Sugar cookies");
        if (raisinRem == 3 && sugarRem == 2)
            test1 = true;
        else
            System.out.println(
                    "Oops! Looks like your code doesn't return the correct value for cookie order varieties that exist.\n");
        int chipRem = order.removeVariety("Chocolate Chip");
        System.out.println("Removed " + chipRem + " boxes of Chocolate Chip cookies");
        if (chipRem == 0)
            test2 = true;
        else
            System.out.println(
                    "Oops! Looks like your code doesn't return the correct value for cookie orders that don't exist in the master order.\n");
        if (test1 && test2)
            System.out.println("Looks like your code works well!");
        else
            System.out.println("Make some changes to your code, please.");
    }
}
