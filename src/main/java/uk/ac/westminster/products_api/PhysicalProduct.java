package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
        super();
    }
    public PhysicalProduct(long id, String name, double price, String downloadUrl, double fileSizeMB) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
