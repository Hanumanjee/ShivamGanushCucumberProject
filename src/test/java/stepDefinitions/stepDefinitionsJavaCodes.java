package stepDefinitions;
import GaneshCucumber.interviewCodes.InterviewLevel1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class stepDefinitionsJavaCodes {
    String reverseString;
    @Given("^User is asked by (.+)$")
    public void user_is_asked_by(String interviewquestion) throws Throwable {
        System.out.println("Interview Question is asked: "+ interviewquestion);

    }

    @When("^User writes the code for (.+)$")
    public void user_writes_the_code_for(String interviewquestion) throws Throwable {
        System.out.println(interviewquestion + " code is written");
        if (interviewquestion.contains("Reverse String")) {

            reverseString = InterviewLevel1.reverseString("Cucumberest");

        }
    }
    @Then("^(.+) result will be displayed$")
    public void result_will_be_displayed(String interviewquestion) throws Throwable {
        if (interviewquestion.contains("Reverse String")) {
            System.out.println("Interview Question result is: " + reverseString);
        }
        else if(interviewquestion.contains("Reverse Digits")){
            System.out.println("---++++------");
        }
    }
}
