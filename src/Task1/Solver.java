package Task1;

public abstract class Solver implements AreaCalculator {
    private final Triangle.TriangleType triangleType;

    protected Solver(Triangle.TriangleType triangleType) {
        this.triangleType = triangleType;
    }

    @Override
    public double calculate(Triangle triangle) {
        double halfPerimeter = (triangle.getSideA()+triangle.getSideB()+triangle.getSideC())/2.f;

        return Math.sqrt(halfPerimeter*(halfPerimeter-triangle.getSideA())*(halfPerimeter-triangle.getSideB())*(halfPerimeter - triangle.getSideC()));
    }
    public boolean canResolve(Triangle triangle){
        return triangleType == triangle.getTriangleType();
    }
}
