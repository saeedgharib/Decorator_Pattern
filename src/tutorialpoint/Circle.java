package tutorialpoint;

// Circle.java
public class Circle implements Shape {
     double price;

    @Override
    public void draw() {
        System.out.println("Shape: Circle,\n Cost: " + Cost());
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
