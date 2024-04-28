public class ECommerceApp {
    public static void main(String[] args) {
        DiningTable diningTable = new DiningTable("Dining Table", 500.0, 50, 100);
        Bookshelf bookshelf = new Bookshelf("Bookshelf", 150, 35, 30);
        ReclinerSofa reclinerSofa = new ReclinerSofa("Recliner Sofa", 200.0, 50, 15);

        ShippingCalc shippingCostCalculator = new CostCalc();

        double diningTableShipCost = diningTable.accept(shippingCostCalculator);
        double bookshelfShipCost = bookshelf.accept(shippingCostCalculator);
        double reclinerSofaShipCost = reclinerSofa.accept(shippingCostCalculator);

        System.out.println("\nPrice of Dining Table: $" + diningTable.getPrice());
        System.out.printf("The Shipping cost for Dining Table: $%.2f\n", diningTableShipCost);

        System.out.println("\nPrice of Bookshelf: $" + bookshelf.getPrice());
        System.out.println("The Shipping cost for Bookshelf: $" + bookshelfShipCost);


        System.out.println("\nPrice of Recliner Sofa: $" + reclinerSofa.getPrice());
        System.out.println("The Shipping cost for Recliner Sofa: $" + reclinerSofaShipCost);

    }
}
