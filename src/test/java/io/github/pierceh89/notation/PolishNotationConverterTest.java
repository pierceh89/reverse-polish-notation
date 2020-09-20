package io.github.pierceh89.notation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolishNotationConverterTest {

    private PolishNotationConverter sut;

    @Before
    public void setup() {
        sut = new PolishNotationConverter();
    }

    @Test
    public void testExpressions() {
        System.out.println(sut.convertExpression("1 2 +"));
        System.out.println(sut.convertExpression("2 3 + 4 *"));
        System.out.println(sut.convertExpression("3 5 + 4 2 + *"));
    }
}