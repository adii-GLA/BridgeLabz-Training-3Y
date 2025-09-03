class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
        System.out.println("Item Added: " + itemName);
    }

    void removeItem() {
        System.out.println("Item Removed: " + itemName);
        itemName = null;
        price = 0;
        quantity = 0;
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.addItem("Laptop", 50000, 1);
        c.displayTotalCost();
        c.removeItem();
    }
}