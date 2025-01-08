import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class orderingSystem {

    @Test
    public void ordering() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("F:\\uni\\1.1 and 1.2\\Skill Development project 1\\Final project 1\\project2 (1)\\project2\\index.html");

            //Item Beverages
            WebElement dropdown1 = driver.findElement(By.id("item"));
            Select select1 = new Select(dropdown1);
            select1.selectByVisibleText("Dark Coffee");
            select1.selectByValue("Dark Coffee");
            select1.selectByIndex(7);

            //Item CupSize
            WebElement dropdown2 = driver.findElement(By.id("cupSize"));
            Select select2 = new Select(dropdown2);
            select2.selectByVisibleText("Small");
            select2.selectByValue("small");
            select2.selectByIndex(1);

            //SugarLevel
            WebElement dropdown3 = driver.findElement(By.id("sugarLevel"));
            Select select3 = new Select(dropdown3);
            select3.selectByVisibleText("Low sugar");
            select3.selectByValue("Low sugar");
            select3.selectByIndex(1);

            //amount
            WebElement Amount = driver.findElement(By.id("amount"));
            Amount.clear();
            Amount.sendKeys("2");

            //click add button
            WebElement Amount_Button = driver.findElement(By.xpath("/html/body/div/div[2]/button[1]"));
            Amount_Button.click();

            WebElement Amount1 = Amount;
            Amount1.clear();

            WebElement Bill = driver.findElement(By.className("bill"));

            //New Customer
            //WebElement New_Customer = driver.findElement(By.xpath("/html/body/div/div[2]/button[3]"));
            //New_Customer.click();

            }
        }















