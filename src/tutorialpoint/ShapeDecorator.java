package tutorialpoint;

// ShapeDecorator.java
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    protected double decorationPrice;

    public ShapeDecorator(Shape decoratedShape, double decorationPrice) {
        this.decoratedShape = decoratedShape;
        this.decorationPrice = decorationPrice;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    @Override
    public double getPrice() {
        return decoratedShape.getPrice();
    }

    @Override
    public void setPrice(double price) {
        decoratedShape.setPrice(price);
    }

    @Override
    public double Cost() {
        return decoratedShape.Cost() + decorationPrice;
    }
}
