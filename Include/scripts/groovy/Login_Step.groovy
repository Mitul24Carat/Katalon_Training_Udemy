import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login_Step {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User is on Login Page")
	def given_Login_Page() {
		println('\n' + Given)
	}

	@When("User Enters Username and Password")
	def when_Enters_Data() {
		println('\n' + When)
	}

	@And("Clicks on Login Button")
	def and_Click_On_Button() {
		println('\n' + And)
	}

	@Then("User redirects to the Dashboard Page")
	def then_Redirects_To_Dashboard() {
		println('\n' + Then)
	}
}