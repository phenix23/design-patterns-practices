package behavioral.stragtegy;

import org.junit.Assert;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void testStrategyAdd(){
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyAdd());
        Assert.assertEquals(7,context.executeStrategy(2,5));
    }

    @Test
    public void testStrategySubtract(){
        Context context = new Context();
        context.setStrategy(new ConcreteStrategySubtract());
        Assert.assertEquals(-3,context.executeStrategy(2,5));
    }

    @Test
    public void testStrategyMultiple(){
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyMultiple());
        Assert.assertEquals(10,context.executeStrategy(2,5));
    }
}
