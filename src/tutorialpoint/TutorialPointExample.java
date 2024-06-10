package tutorialpoint;

public class TutorialPointExample {
    public static void main(String[] args) {


        Shape circle = new Circle();
        circle.setPrice(50);

        Shape redCircle = new RedShapeDecorator(new Circle(), 100);
        redCircle.setPrice(100);
        Shape Rectangle = new RedShapeDecorator(new Rectangle(), 500);
        Rectangle.setPrice(650);
        Shape redRectangle = new RedShapeDecorator(new Rectangle(), 1000);
        redRectangle.setPrice(250);

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
        System.out.println("\nRectangle of red border");
        Rectangle.draw();

    }

}

// DecoratorPatternDemo.java


