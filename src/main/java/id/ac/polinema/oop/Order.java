package id.ac.polinema.oop;

public class Order {
    private int capacity = 10;
    private Customer customer;
    private OrderItem[] items;
    private int itemCount;
    private double diskon = 0.10;

    public Order(Customer customer){
        this.customer = customer;
        this.items = new OrderItem[capacity];
        this.itemCount = 0;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void addItem(MenuItem menuItem, int quantity){
        if (itemCount > items.length) {
            return;
        }
        items[itemCount] = new OrderItem(menuItem, quantity);
        itemCount++;
    }
    
    public int getItemCount(){
        return itemCount;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++){
            total += items[i].getSubTotal();
        }
        return total;
    }

    public double getFinalTotal(){
        double total = getTotal();
        if (total >= 100000){
            double potongan =  total * diskon;
            return total - potongan;
        }
         return total;
    }
}
