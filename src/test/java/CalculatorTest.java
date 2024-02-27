import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
        @Test
    void add()
        {

            int result = calculator.add(10,  20) ;
            Assertions.assertEquals(30, result) ;

        }

    @Test
    void subtract ()
    {
        int result = calculator.subtract(20, 10) ;
        Assertions.assertEquals(10 , result) ;
    }

    @Test
    void multiply()
    {
        Assertions.assertEquals(50, calculator.multiply(10 ,5));
    }

    @Test
    void divideWithoutZeroArithmeticException()
    {
        Assertions.assertEquals(20, calculator.divide(100,5));
    }

    @Test
    void divideByZeroShouldThrowException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

}
