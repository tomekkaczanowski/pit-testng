package pl.kaczanowscy.tomek;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

@Test
public class MyClassTest {

    @Test
    public void testMeBaby() {
        MyClass sut = new MyClass();
        assertTrue(sut.myMethod(1, true));
        assertTrue(sut.myMethod(2, true));
        assertTrue(sut.myMethod(1, false));
        assertTrue(sut.myMethod(2, false));
        assertFalse(sut.myMethod(0, false));
    }
}