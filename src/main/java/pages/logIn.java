package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logIn extends basePage{
    public logIn(WebDriver driver) {
        super(driver);
    }

    private By loginbutton = By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div[2]/ul/li[2]/a");

    private By username = By.name("Email");

    public void loginPage() {
        driver.get("https://dev.technicalhub.io/codemind/");
    }

    public void clickloginbutton() {
        WebElement log = driver.findElement(loginbutton);
        log.click();
    }

    public void typename(String name) {
        WebElement uname = driver.findElement(username);
        uname.sendKeys(name);
    }

}
