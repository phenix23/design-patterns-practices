package behavioral.stragtegy;

public class ConcreteStrategyMultiple implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a * b ;
    }
}
