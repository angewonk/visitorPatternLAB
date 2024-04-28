public class ECommerceApp {
    public static void main(String[] args) {
        DiningTable diningTable = new DiningTable("Dining Table", 500.0, 50, 70);
        Bookshelf bookshelf = new Bookshelf("Bookshelf", 150, 30, 30);
        ReclinerSofa reclinerSofa = new ReclinerSofa("Recliner Sofa", 200.0, 50, 30);

        ShippingCalculator shippingCostCalculator = new ShippingCostCalculator();

        double diningTableShipCost = diningTable.accept(shippingCostCalculator);
        double bookshelfShipCost = bookshelf.accept(shippingCostCalculator);
        double reclinerSofaShipCost = reclinerSofa.accept(shippingCostCalculator);

        System.out.println("Price of Dining Table: $" + diningTable.getPrice());
        System.out.printf("The Shipping cost for Dining Table: $%.2f\n", diningTableShipCost);

        System.out.println("Price of Bookshelf: $" + bookshelf.getPrice());
        System.out.println("The Shipping cost for Bookshelf: $" + bookshelfShipCost);


        System.out.println("Price of Recliner Sofa: $" + reclinerSofa.getPrice());
        System.out.println("The Shipping cost for Recliner Sofa: $" + reclinerSofaShipCost);

    }
}
