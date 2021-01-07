package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutLine1 {

@Given("User in on Aapplication site")
public void user_in_on_aapplication_site() {
System.out.println("User open the URL of the Application");

}

@When("user click on Login Page")
public void user_click_on_login_page() {
System.out.println("User click on Login page link");
}

@Then("user is displyed on login Screen")
public void user_is_displyed_on_login_screen() {

System.out.println("User get's the Log in page screen on his windows");
}

@When("user Enters the userName {string} in userName feild")
public void user_enters_the_user_name_in_user_name_feild(String userName) {
System.out.println("User enters the User Name :: "+userName);

}

@When("user Enters the Password {string} in password feild")
public void user_enters_the_password_in_password_feild(String password) {
System.out.println("User enters the Password feild :: "+password);

}

@When("User clicks the Signin button")
public void user_clicks_the_signin_button() {
System.out.println("After Enters the User_Name and Passwords and Then click on Login Button  ");

}

@Then("user get login faild information from the page")
public void user_get_login_faild_information_from_the_page() {
System.out.println("User get's the faild or succusfull information from the Application ");

}


}
