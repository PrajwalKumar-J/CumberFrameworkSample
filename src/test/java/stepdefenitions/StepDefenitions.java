package stepdefenitions;

import org.junit.runner.RunWith;

import CucumberOptions.TestFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefenitions 
{

	@Given("provided data")
	public void provided_data()
	{
		TestFunction.Program1();
	}
	@When("condition given")
	public void condition_given()
	{
		TestFunction.Program2();
	}
	@And("other condition")
	public void other_condition()
	{
		TestFunction.Program3();
	}
	@Then("execute the function")
	public void execute_the_function()
	{
		TestFunction.Program4();
	}
}
