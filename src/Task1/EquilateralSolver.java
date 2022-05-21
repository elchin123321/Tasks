package Task1;

public class EquilateralSolver extends Solver {
    protected EquilateralSolver() {
        super(Triangle.TriangleType.EQUILATERAL);
    }

    @Override
    public double calculate(Triangle triangle) {
        double square = (Math.pow(triangle.getSideA(),2)*Math.sqrt(3))/4;
        System.out.println("Equilateral Triangle: "+ square);

        return square;
    }
}
