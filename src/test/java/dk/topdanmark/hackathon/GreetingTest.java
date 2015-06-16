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
        assertTrue(1==2);

    }
}

