public interface ShippingCalc {
    double calculateShippingCost(DiningTable diningTable);
    double calculateShippingCost(Bookshelf bookshelf);
    double calculateShippingCost(ReclinerSofa reclinerSofa);
}