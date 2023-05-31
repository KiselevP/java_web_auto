package hw4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestClass {
    @Test
    void test() throws MyException {
        ExampleClass exampleClass = new ExampleClass();
        Assertions.assertEquals(6, exampleClass.squareTriangle(3,4, 5));
        Assertions.assertThrows(MyException.class, ()-> exampleClass.squareTriangle(-3,4,5));
        Assertions.assertThrows(MyException.class, ()-> exampleClass.squareTriangle(0,4,5));
        Assertions.assertThrows(MyException.class, ()-> exampleClass.squareTriangle(1,4,5));
    }
    @ParameterizedTest
    @CsvSource({ "30,40,50,600","3,4,5,6"})
    void testWithCsvSource(int a, int b, int c, int result) throws MyException {
        ExampleClass exampleClass = new ExampleClass();
        Assertions.assertEquals(result,exampleClass.squareTriangle(a,b,c));
    }
}
