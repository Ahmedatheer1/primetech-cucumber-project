package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_StepDef {
    WebDriver driver;
    @Given("User is navigated to saucedemo.com")
    public void user_is_navigated_to_saucedemo_com() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

    }
    @When("User enters {string} in the username field")
    public void user_enters_in_the_username_field(String string) {
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
    }
    @And("User enters {string} in the password field")
    public void user_enters_in_the_password_field(String string) {

    }
    @And("User clicks on Login Button")
    public void user_clicks_on_login_button() {

    }

    @Then("User is able to verify the {string} label is displayed")
    public void user_is_able_to_verify_the_label_is_displayed(String string) {

    }



}
