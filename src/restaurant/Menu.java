package restaurant;

import java.util.Date;
import java.util.HashMap;

public class Menu {

    private HashMap<String, MenuItem> currentMenu;
    private Date DateModified;

    public HashMap<String, MenuItem> getCurrentMenu() {
        return currentMenu;
    }

    private void setCurrentMenu(String status, MenuItem menuItem) {
        this.currentMenu.put(status, menuItem);
    }
    public Date getDateModified() {
        return DateModified;
    }

    private void setDateModified(Date dateModified) {
        DateModified = dateModified;
    }


}
