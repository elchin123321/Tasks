package Task1;

public class RegularResolver extends Resolver{
    protected RegularResolver() {
        super(Triangle.TriangleType.REGULAR);
    }

    @Override
    public double calculate(Triangle triangle) {
        double square = super.calculate(triangle);
        System.out.println("Regular triangle: "+square);
        return square;
    }
}
