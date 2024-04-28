public class ReclinerSofa implements Furniture {
    private double price;
    private double weight;
    private double distance;

    // Constructor
    public ReclinerSofa(String name, double price, double weight, double distance) {
        this.price = price;
        this.weight = weight;
        this.distance = distance;
    }


    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public double accept(ShippingCalc calculator) {
        return calculator.calculateShippingCost(this);
    }


}
