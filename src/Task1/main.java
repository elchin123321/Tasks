package Task1;

public class main {
    public static void main(String[] args){
        Triangle[] triangles = {new Triangle(2,2,2),new Triangle(2,2,3),new Triangle(3,3,4),new Triangle(2,3,4),new Triangle(1,1,1),new Triangle(3,4,5)};
        SolverChain chain1 = new SolverChain(new EquilateralSolver());
        SolverChain chain2 = new SolverChain(new IsoscelesSolver());
        SolverChain chain3 = new SolverChain(new RectangularSolver());
        SolverChain chain4 = new SolverChain(new RegularSolver());
        chain1.setNextResolverChain(chain2);
        chain2.setNextResolverChain(chain3);
        chain3.setNextResolverChain(chain4);
        for(int i = 0; i<triangles.length;i++){
            chain1.calculate(triangles[i]);
        }
    }

}
