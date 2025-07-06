public class Rectangle implements Figure {
    private final double width;
    private final double height;
    private final String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() +
                " sq. units, width: " + width + " units, height: " + height + " units, color: " + color);
    }
}

