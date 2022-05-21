package Task1;

public class IsoscelesSolver extends Solver {
    protected IsoscelesSolver() {
        super(Triangle.TriangleType.ISOSCELES);
    }

    @Override
    public double calculate(Triangle triangle) {
        double h;
        double square;
        if(triangle.getSideA() == triangle.getSideB()){
            h = Math.sqrt(Math.pow(triangle.getSideA(),2)-Math.pow(triangle.getSideC()/2.d,2));
            square = 0.5*triangle.getSideC()*h;
        }
        else if(triangle.getSideA() == triangle.getSideC()){
            h = Math.sqrt(Math.pow(triangle.getSideA(),2)-Math.pow(triangle.getSideB()/2.d,2));
            square = 0.5*triangle.getSideB()*h;
        }
        else {
            h = Math.sqrt(Math.pow(triangle.getSideB(),2)-Math.pow(triangle.getSideA()/2.d,2));
            square = 0.5*triangle.getSideC()*h;
        }
        System.out.println("Isosceles Triangle: "+ square);

        return square;
    }
}
