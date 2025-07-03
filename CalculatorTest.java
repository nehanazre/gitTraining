import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Assert.assertEquals(30, calc.add(10, 20));
    }
}
