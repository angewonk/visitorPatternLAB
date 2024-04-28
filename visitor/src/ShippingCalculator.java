public interface ShippingCalculator {
    double calculateShippingCost(DiningTable diningTable);
    double calculateShippingCost(Bookshelf bookshelf);
    double calculateShippingCost(ReclinerSofa reclinerSofa);
}