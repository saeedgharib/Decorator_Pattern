package tutorialpoint;

// RedShapeDecorator.java
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape, double decorationPrice) {
        super(decoratedShape, decorationPrice);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
        System.out.println("Cost having Red Border: " + Cost());
    }

    @Override
    public double Cost() {
        return decorationPrice;
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
