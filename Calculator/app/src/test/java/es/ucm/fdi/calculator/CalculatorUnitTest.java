package es.ucm.fdi.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorUnitTest {
        @Test
        public void integerAddition_isCorrect() {
            assertEquals(5, new Calculator().add(2,3),0);
        }
        public void doubleAddition_isCorrect() {
            assertEquals(5.2, new Calculator().add(2.5,2.7),0);
        }
}
