public class Bookshelf implements Furniture {
    private double price;
    private double weight;

    private double size;
    public Bookshelf(String bookshelf, double price, double weight, double size) {
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
    public double getSize() {
        return size;
    }


    @Override
    public double accept(ShippingCalculator calculator) {
        return calculator.calculateShippingCost(this);
    }
}
