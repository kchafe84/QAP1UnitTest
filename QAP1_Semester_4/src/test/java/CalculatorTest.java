import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void twoPLusTwoEqualsFour(){
        Calculator calculator = new Calculator();
        assertEquals(18,calculator.add(3,6,9));
    }


}