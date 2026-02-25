import jdk.jfr.Name;
import object_oriented_analysis_design_coursera.Generator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


/*
 * No testing is required for Project 1.  If you want to explore JUnit
 * feel free to try tests like the one below.  Remember to see the tutorial
 * reading on adding Extension Pack for Java to your project to allow interactively
 * running your JUnit test cases.
 *
 * https://junit.org/junit5/docs/5.4.0/api/org/junit/jupiter/api/Assertions.html
 * has a full list of available methods of assertion types for JUnit 5.
 */
public class GeneratorTest {
    /**
     * Here's a typical Assertion types that you can use. Visit the
     * link above for the full list of available methods.
     */

    @Test
    public void generatorTest1() {
        /*
         * In case of a failing test, student will see a failure message of the form
         * "Generator test 1 failed ==> expected: <5> but was: <*>".
         */
        Generator g = new Generator();  // make an instance of a Generator
        assertNotNull(g, "Generator test 1 failed");  // is the object not null?
    }
}