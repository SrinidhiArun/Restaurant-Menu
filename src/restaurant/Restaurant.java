package restaurant;

import java.util.Date;

public class Restaurant {
    public static void main(String[] args){
        MenuItem menuItem1 = new MenuItem(12, "pizza", "Appetizer");
        MenuItem menuItem2 = new MenuItem(12,"pasta","main course");
        MenuItem menuItem3 = new MenuItem(4.99,"Chocolate Churro","Dessert");
        MenuItem menuItem4 = new MenuItem(11.9,"Quesadilla","main course");
        MenuItem menuItem5 = new MenuItem(8.99, "Caesar salad","main course");
        menuItem5.setNew(true);
        menuItem2.setNew(true);
        Menu menu = new Menu();
        //adding menu items
        menu.setCurrentMenu(menuItem1);
        menu.setCurrentMenu(menuItem2);
        menu.setCurrentMenu(menuItem3);
        menu.setCurrentMenu(menuItem4);
        menu.setCurrentMenu(menuItem5);
        //print menu
        System.out.println("*******");
        menu.printMenu();
        System.out.println("*******");
        //remove menu items
        menu.removeMenuItem(menuItem1);
        // print menu
        System.out.println("*******");
        menu.printMenu();
        System.out.println("*******");
        //print one menu item
        System.out.println("*******");
        menu.printMenuItem(menuItem4);
        System.out.println("*******");

        menu.setDateModified(new Date());
        System.out.println("Last updated: " + menu.getDateModified());
        System.out.println("Checking whether menu items are same: "+menuItem1.equals(menuItem4));
        System.out.println("Is menu item new? "+ menuItem2.getNew());
        System.out.println("Is menu item new? "+ menuItem1.getNew());

    }
}
