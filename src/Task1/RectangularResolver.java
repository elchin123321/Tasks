package Task1;

public class RectangularResolver extends Resolver{
    protected RectangularResolver() {
        super(Triangle.TriangleType.RECTANGULAR);
    }

    @Override
    public double calculate(Triangle triangle) {
        double square;
        if(triangle.getSideA()>triangle.getSideB()&& triangle.getSideA()>triangle.getSideC()){
            square = triangle.getSideB()*triangle.getSideC()*0.5;
        }else if(triangle.getSideB()>triangle.getSideA()&& triangle.getSideB()>triangle.getSideC()){
            square = triangle.getSideC()*triangle.getSideA()*0.5;
        }else{
            square = triangle.getSideB()*triangle.getSideC()*0.5;
        }

        System.out.println("Rectangular Triangle: "+ square);
        return super.calculate(triangle);
    }
}
