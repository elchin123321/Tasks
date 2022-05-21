package Task1;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final TriangleType triangleType;


    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        triangleType = defineType();
    }

    public TriangleType defineType(){
        TriangleType type;
        if(sideA == sideB && sideA == sideC){
            type = TriangleType.EQUILATERAL;
        }else if(sideA == sideB || sideA == sideC || sideB==sideC){
            type = TriangleType.ISOSCELES;
        } else if(Math.pow(sideA,2) == Math.pow(sideB,2)+Math.pow(sideC,2) ||
                Math.pow(sideB,2) == Math.pow(sideA,2)+Math.pow(sideC,2) ||
                Math.pow(sideC,2) == Math.pow(sideB,2)+Math.pow(sideA,2)){
            type = TriangleType.RECTANGULAR;
        }else {
            type = TriangleType.REGULAR;
        }
        return type;
    }
    public TriangleType getTriangleType(){
        return triangleType;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    enum TriangleType{
        EQUILATERAL,
        ISOSCELES,
        RECTANGULAR,
        REGULAR
    }
}
