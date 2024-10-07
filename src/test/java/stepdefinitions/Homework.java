package stepdefinitions;


import io.cucumber.java.en.And;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Homework {
    WebDriver driver = new ChromeDriver();
    @Given("user is logged in successfully")
    public void user_is_logged_in_successfully() throws InterruptedException {
       driver.get("http://crater.primetech-apps.com/login");
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("estimates@crater.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("primetech@school");


        WebElement loginButton = driver.findElement(By.xpath("//button[@class='inline-flex whitespace-nowrap items-center border font-medium focus:outline-none focus:ring-2 focus:ring-offset-2 px-4 py-2 text-sm leading-5 rounded-md border-transparent shadow-sm text-white bg-primary-600 hover:bg-primary-700 focus:ring-primary-500']"));
        loginButton.click();

    }
    @When("the user is on the items page")
    public void the_user_is_on_the_items_page() {
      WebElement itembutton = driver.findElement(By.xpath("//a[@href='/admin/items']"));
      itembutton.click();


    }
    @And("the user clicks on the Add Item button")
    public void the_user_clicks_on_the_add_item_button() {
        WebElement addItemButton = driver.findElement(By.xpath("//button[@class='inline-flex whitespace-nowrap items-center border font-medium focus:outline-none focus:ring-2 focus:ring-offset-2 px-4 py-2 text-sm leading-5 rounded-md border-transparent shadow-sm text-white bg-primary-600 hover:bg-primary-700 focus:ring-primary-500']"));
        addItemButton.click();
    }
    @And("the user enters the item name")
    public void the_user_enters_the_item_name() {
      WebElement itemName = driver.findElement(By.xpath("//input[@class='font-base block w-full sm:text-sm border-gray-200 rounded-md text-black focus:ring-primary-400 focus:border-primary-400']"));
      itemName.sendKeys("Ahmed_Item");
    }
    @And("the user enters the item description")
    public void the_user_enters_the_item_description() {
       WebElement descroption = driver.findElement(By.xpath("//textarea[@name='description']"));
       descroption.sendKeys("RealMadrid");
    }
    @And("the user enters the item price {string}")
    public void the_user_enters_the_item_price(String string) {
        WebElement price = driver.findElement(By.xpath("//input[@type='tel']"));
        price.sendKeys("100");
    }
    @And("the user selects the item unit {string}")
    public void the_user_selects_the_item_unit(String string) {
        WebElement unitDropDown = driver.findElement(By.xpath("//input[@class='w-full absolute inset-0 outline-none appearance-none box-border border-0 text-sm font-sans bg-white rounded-md pl-3.5']"));
        Select select = new Select(unitDropDown);
        unitDropDown.click();
        WebElement option = driver.findElement(By.xpath("//li[@class='flex items-center justify-start box-border text-left cursor-pointer text-sm leading-snug py-2 px-3 text-white bg-primary-500 opacity-90']"));
        option.click();

    }
    @And("the user clicks on the Save Item button")
    public void the_user_clicks_on_the_save_item_button() {
       WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit']"));
       saveButton.click();
    }
    @Then("the item should be listed in the items table")
    public void the_item_should_be_listed_in_the_items_table() {

    }


}
