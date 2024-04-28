public class CostCalc implements ShippingCalc {
    private static final double weightRate = 0.2;
    private static final double sizeRate = 0.1;
    private static final double distanceRate = 0.03;

    @Override
    public double calculateShippingCost(DiningTable diningTable) {
        double shippingCost = diningTable.getWeight() * weightRate + diningTable.getSize() * sizeRate;
        return shippingCost;
    }

    @Override
    public double calculateShippingCost(Bookshelf bookshelf) {
        double shippingCost = bookshelf.getWeight() * weightRate + bookshelf.getSize() * sizeRate;
        return shippingCost;
    }

    @Override
    public double calculateShippingCost(ReclinerSofa reclinerSofa) {
        double shippingCost = reclinerSofa.getPrice() * sizeRate + reclinerSofa.getDistance() * distanceRate;
        return shippingCost;
    }
}