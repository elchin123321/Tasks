package Task1;

public class main {
    public static void main(String[] args){
        Triangle[] triangles = {new Triangle(2,2,2),new Triangle(2,2,3),new Triangle(3,3,4),new Triangle(2,3,4),new Triangle(1,1,1),new Triangle(3,4,5)};
        ResolverChain chain1 = new ResolverChain(new EquilateralResolver());
        ResolverChain chain2 = new ResolverChain(new IsoscelesResolver());
        ResolverChain chain3 = new ResolverChain(new RectangularResolver());
        ResolverChain chain4 = new ResolverChain(new RegularResolver());
        chain1.setNextResolverChain(chain2);
        chain2.setNextResolverChain(chain3);
        chain3.setNextResolverChain(chain4);
        for(int i = 0; i<triangles.length;i++){
            chain1.calculate(triangles[i]);
        }
    }

}
