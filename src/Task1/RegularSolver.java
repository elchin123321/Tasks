package Task1;

public class RegularSolver extends Solver {
    protected RegularSolver() {
        super(Triangle.TriangleType.REGULAR);
    }

    @Override
    public double calculate(Triangle triangle) {
        double square = super.calculate(triangle);
        System.out.println("Regular triangle: "+square);
        return square;
    }
}
