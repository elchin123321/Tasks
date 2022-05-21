package Task1;

public class SolverChain implements AreaCalculator{
    private final Solver solver;
    private SolverChain nextResolver;
    public SolverChain(Solver solver) {
        this.solver = solver;
    }

    @Override
    public double calculate(Triangle triangle) {
        double square;
        if(solver.canResolve(triangle)){
           square =  solver.calculate(triangle);
        }else if(nextResolver!=null){
            square = nextResolver.calculate(triangle);
        }else {
            square = 0;
        }
        return square;
    }

    public void setNextResolverChain(SolverChain nextSolverChain){
        this.nextResolver = nextSolverChain;
    }
}
