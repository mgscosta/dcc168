package com.ui.icmctest;
        import org.junit.Test;
        import org.junit.Before;
        import org.junit.After;
        import static org.junit.Assert.*;
        import static org.hamcrest.CoreMatchers.is;
        import static org.hamcrest.core.IsNot.not;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.remote.RemoteWebDriver;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.openqa.selenium.Dimension;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.Alert;
        import org.openqa.selenium.Keys;
        import java.util.*;
        import java.net.MalformedURLException;
        import java.net.URL;

public class TeachersTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void teacherstest() throws InterruptedException {
        driver.get("https://www.icmc.usp.br/");
        driver.manage().window().setSize(new Dimension(1936, 1056));
        driver.findElement(By.cssSelector(".item-129 > a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@value=\'Docente\']")).click();
        Thread.sleep(1000);
        assertEquals(24, driver.findElements(By.className("thumbnail")).size());
    }
}
