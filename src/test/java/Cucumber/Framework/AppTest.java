package Cucumber.Framework;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import CucumberOptions.TestFunction;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	TestFunction.Run();
        assertTrue( true );
    }
}
