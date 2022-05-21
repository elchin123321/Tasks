package Task1;

public class ResolverChain implements AreaCalculator{
    private final Resolver resolver;
    private ResolverChain nextResolver;
    public ResolverChain(Resolver resolver) {
        this.resolver  = resolver;
    }

    @Override
    public double calculate(Triangle triangle) {
        double square;
        if(resolver.canResolve(triangle)){
           square =  resolver.calculate(triangle);
        }else if(nextResolver!=null){
            square = nextResolver.calculate(triangle);
        }else {
            square = 0;
        }
        return square;
    }

    public void setNextResolverChain(ResolverChain nextResolverChain){
        this.nextResolver = nextResolverChain;
    }
}
