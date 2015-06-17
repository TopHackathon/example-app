package dk.topdanmark.hackathon;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Greeting Test class
 *
 * Created by npo on 09-06-2015.
 */
public class GreetingTest {

    private Greeting greeting;

    @Before
    public void setup() {

        greeting = new Greeting();
    }

    @Test
    public void testGreetingReturnsCorrect() {

        //Hmm this seems wrong - hint hint
        assertEquals("Hrello Nik",greeting.sayHello("Nik"));
    }

    @Test
    public void testGreetingReturnsNotCorrect() {

        //Hmm this seems wrong - hint hint
        assertNotEquals("Hello Nik", greeting.sayHello("Nik"));
    }

    @Test
    public void test_once_again() {
        assertTrue(4==4);
        assertTrue(5==5);
        assertTrue(6==6);

    }
    @Test
    public void test_even_more() {
        assertTrue(2==2);

    }

    @Test
    public void test_even_more2() {
        assertTrue(2==2);
        assertTrue(3==3);

    }
}
