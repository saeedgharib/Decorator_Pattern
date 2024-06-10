package tutorialpoint;

// Rectangle.java
public class Rectangle implements Shape {
    private double price;

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle, Cost: " + Cost());
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double Cost() {
        return price;
    }
}
