package restaurant;

public class MenuItem {
    private double price;
    private String description;
    private String category;

    MenuItem(double price,String description,String category){
        this.price = price;
        this.description = description;
        this.category = category;
    }
}
