package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {

    private ArrayList<MenuItem> currentMenu = new ArrayList<>();
    private Date DateModified;

    public ArrayList<MenuItem> getCurrentMenu() {
        return currentMenu;
    }

    protected void setCurrentMenu(MenuItem menuItem) {
        this.currentMenu.add(menuItem);
    }
    public Date getDateModified() {
        return DateModified;
    }

    protected void setDateModified(Date dateModified) {
        DateModified = dateModified;
    }

    protected boolean removeMenuItem(MenuItem menuItem){
        return this.currentMenu.remove(menuItem);
    }

    protected void printMenu(){
        for(MenuItem menuItem: this.currentMenu){
            System.out.println(menuItem);
        }
    }

    protected void printMenuItem(MenuItem menu){
        System.out.println(menu);
    }
}
