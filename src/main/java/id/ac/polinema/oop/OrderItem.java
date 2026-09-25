package id.ac.polinema.oop;

public class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem (MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem(){
    return menuItem;
    }

    public int quantity(){
        return quantity;
    }
    
    public double getSubTotal(){
        return menuItem.getPrice() * quantity;
    }
}

