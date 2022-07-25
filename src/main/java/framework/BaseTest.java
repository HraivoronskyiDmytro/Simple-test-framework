package framework;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.PagesContainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseTest {

    static WebDriver driver;
    Util csv = new Util();
    static WebDriverManager wdm = WebDriverManager.chromedriver();
    protected PagesContainer web;

    public WebDriver getDriver() {
        return driver;
    }


   @BeforeMethod
    public void setUp(){
//       System.getProperties().stringPropertyNames().forEach(System.out::println);
//      System.out.println( System.getenv("browser"));
//       System.out.println( System.getProperty("browser"));
        switch (System.getProperty("browser","chrome")) {
            case "firefox":
                wdm =  WebDriverManager.firefoxdriver();
                break;
            case "edge":
                wdm =  WebDriverManager.edgedriver();
                break;
            case "chrome":
            default:
                wdm =  WebDriverManager.chromedriver();
                break;

                }

        wdm.browserInDocker().enableVnc().enableRecording();
        driver = wdm.create();
        web = new PagesContainer(driver);
    }

    @Step("Open page")
    public void open(String URL) {
        driver.get(URL);
    }

    @AfterMethod
   public void teardown() {
        driver.quit();
        wdm.quit();
    }

    @DataProvider(name = "test-data")
    public Iterator<Object []> provider( )
    {
        List<Object []> testCases = new ArrayList<>();
        String[] data;
        String line;

       BufferedReader br = new BufferedReader(csv.
               readFile(Paths.get("src", "test", "java")
                       .normalize()
                       .toAbsolutePath()
                       .toString().replaceAll("\\.", "/") + "/tests/data.csv" ));
       try {
        while ((line = br.readLine()) != null) {
            // use comma as separator
            data= line.split(",");
            testCases.add(data);
        }
       }
      catch (IOException e) {
           System.out.println("File is ended");
       }
        return testCases.iterator();
    }
}